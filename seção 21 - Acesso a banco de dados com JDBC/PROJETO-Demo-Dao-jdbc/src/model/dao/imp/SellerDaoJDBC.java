package model.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void update(Seller obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null; // prepara uma consulta sql
        ResultSet rs = null; // guarda o resultado da consulta em formato de tabela
        try{
            st = conn.prepareStatement(
                "SELECT seller.*,department.Name as " + "DepName "// Busca todos os campos do vendedor + o departamento. Esse departamento é apelidado de Depname
                + "FROM seller INNER JOIN department "//é realizado um join para realizar os dados das duas tabelas(seller e department)
                + "ON seller.DepartmentId = department.Id "
                + "WHERE seller.Id = ?"); // restrução: onde id do seller é ...(valor do id)
            st.setInt(1, id); 
            rs = st.executeQuery();// O comando do sql é executado e o resultado pertencer à variável rs

            // testa se a consulta gerou resultado
            if(rs.next()) { // se gerou, então executará normalmente a tabela
                Department dep = new Department();
                dep.setId(rs.getInt("DepartmentId"));//peguei o id do department
                dep.setName(rs.getString("Depname"));//peguei o nome do departamento

                Seller obj = new Seller();
                obj.setId(rs.getInt("Id"));
                obj.setName(rs.getString("Name"));
                obj.setEmail(rs.getString("Email"));
                obj.setBaseSalary(rs.getDouble("BaseSalary"));
                obj.setBirthDate(rs.getDate("BirthDate"));
                obj.setDepartment(dep);
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

    @Override
    public List<Seller> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
