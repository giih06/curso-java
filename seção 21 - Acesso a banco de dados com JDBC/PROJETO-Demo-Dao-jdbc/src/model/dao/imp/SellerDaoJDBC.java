package model.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

// Essa classe é uma implementação JDBC do SellerDao
public class SellerDaoJDBC implements SellerDao {

    // essa classe conecta com o banco de dados automaticamente:
    private Connection conn;
    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {
        PreparedStatement st = null;// prepara uma consulta sql
		try {
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
            // Define os dados
			st.setString(1, obj.getName());
			st.setString(2, obj.getEmail());
			st.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
			st.setDouble(4, obj.getBaseSalary());
			st.setInt(5, obj.getDepartment().getId());
			
			int rowsAffected = st.executeUpdate();
			 
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			}
			else {
				throw new DbException("Unexpected error! No rows affected!");
			}
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
    }

    @Override
    public void update(Seller obj) {
        PreparedStatement st = null;// prepara uma cosulta sql
		try {
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
					+ "WHERE Id = ?");
			
			st.setString(1, obj.getName());
			st.setString(2, obj.getEmail());
			st.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
			st.setDouble(4, obj.getBaseSalary());
			st.setInt(5, obj.getDepartment().getId());
			st.setInt(6, obj.getId());

			st.executeUpdate(); // exexuta o update
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM seller WHERE Id = ?");// Delete de seller onde o Id é ...(id)
			
			st.setInt(1, id);
			
			st.executeUpdate();
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
		}
    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null; // prepara uma consulta sql
        ResultSet rs = null; // guarda o resultado da consulta em formato de tabela
        try{
            st = conn.prepareStatement(
                "SELECT seller.*,department.Name as " + "DepName "// Busca todos os campos do vendedor + o nome do departamento. Esse departamento é apelidado de Depname
                + "FROM seller INNER JOIN department "//é realizado um join para realizar os dados das duas tabelas(seller e department)
                + "ON seller.DepartmentId = department.Id "
                + "WHERE seller.Id = ?"); // restrução: onde id do seller é ...(valor do id)
            st.setInt(1, id); 
            rs = st.executeQuery();// O comando do sql é executado e o resultado pertencer à variável rs

            // testa se a consulta gerou resultado
            if(rs.next()) { // se gerou, então executará normalmente a tabela
                Department dep = instantiateDepartment(rs);
                Seller obj = instantiateSeller(rs, dep);
                return obj;
            }
            return null; // se não gerou, retorna nulo
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            // fecha a conexão
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }

    }

    private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException {
        Seller obj = new Seller();
        obj.setId(rs.getInt("Id"));
        obj.setName(rs.getString("Name"));
        obj.setEmail(rs.getString("Email"));
        obj.setBaseSalary(rs.getDouble("BaseSalary"));
        obj.setBirthDate(rs.getDate("BirthDate"));
        obj.setDepartment(dep);
        return obj;
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();
        dep.setId(rs.getInt("DepartmentId"));//peguei o id do department
        dep.setName(rs.getString("Depname"));//peguei o nome do departamento
        return dep;
    }

    @Override
    public List<Seller> findAll() {
        PreparedStatement st = null; // prepara uma consulta sql
        ResultSet rs = null; // guarda o resultado da consulta em formato de tabela
        try{
            st = conn.prepareStatement(
                "SELECT seller.*,department.Name as DepName "//Busca todos os campos do vendedor + o nome do departamento. Esse departamento é apelidado de Depname
                + "FROM seller INNER JOIN department "//é realizado um join para realizar os dados das duas tabelas(seller e department)
                + "ON seller.DepartmentId = department.Id "
                + "ORDER BY Name");// ordena o resultado por nome

            rs = st.executeQuery();// O comando do sql é executado e o resultado pertencer à variável rs

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();// map do id do departamento

            // testa se a consulta gerou resultado
            while (rs.next()) { // se gerou, então executará normalmente a tabela
                // Busca dentro do map se o DepartmentId inserido ja existe, se n existir o map.get retorna nulo e será instanciado o departamento
                Department dep = map.get(rs.getInt("DepartmentId"));
                if(dep == null) {
                    dep = instantiateDepartment(rs);

                    // salva o departamento dentro do map para que a próxima vez possa ser verificado se esse dep já existe
                    map.put(rs.getInt("DepartmentId"), dep);
                }
                Seller obj = instantiateSeller(rs, dep);
                list.add(obj);
            }
            return list; // retorna a lista
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            // fecha a conexão
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    // Busca os vendedores dado o departamento
    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement st = null; // prepara uma consulta sql
        ResultSet rs = null; // guarda o resultado da consulta em formato de tabela
        try{
            st = conn.prepareStatement(
                "SELECT seller.*,department.Name as DepName "//Busca todos os campos do vendedor + o nome do departamento. Esse departamento é apelidado de Depname
                + "FROM seller INNER JOIN department "//é realizado um join para realizar os dados das duas tabelas(seller e department)
                + "ON seller.DepartmentId = department.Id "
                + "WHERE DepartmentId = ? "// //Onde o departmentId for um certo valor
                + "ORDER BY Name");// ordena o resultado por nome
            st.setInt(1, department.getId()); 
            rs = st.executeQuery();// O comando do sql é executado e o resultado pertencer à variável rs

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();// map do id do departamento

            // testa se a consulta gerou resultado
            while (rs.next()) { // se gerou, então executará normalmente a tabela
                // Busca dentro do map se o DepartmentId inserido ja existe, se n existir o map.get retorna nulo e será instanciado o departamento
                Department dep = map.get(rs.getInt("DepartmentId"));
                if(dep == null) {
                    dep = instantiateDepartment(rs);

                    // salva o departamento dentro do map para que a próxima vez possa ser verificado se esse dep já existe
                    map.put(rs.getInt("DepartmentId"), dep);
                }
                Seller obj = instantiateSeller(rs, dep);
                list.add(obj);
            }
            return list; // retorna a lista
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            // fecha a conexão
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    
}
