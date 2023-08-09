package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {
    // Programa para atualizar o saláro de um vendedor
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement st = null;
        try {

            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "UPDATE seller " // Atualiza os vendedores
                    + "SET BaseSalary = BaseSalary + ? " // mudando o salário para o salário + o valor informado
                    + "WHERE " // onde
                    + "(DepartmentId = ?)"); // O Departmentid for igual ao valor que eu informar 
            
            // informando o valor do aumento
            st.setDouble(1, 250); // numero 1 pois é a primeira interrogação do método, valor do aumento

            // informar o código do departamento
            st.setInt(2, 2); // numero 2 pois é a segunda interrogação do método e 2 pois o código departamento é 2

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows Affected : " +  rowsAffected);

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
