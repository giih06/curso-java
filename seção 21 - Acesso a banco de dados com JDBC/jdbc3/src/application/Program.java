package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // inserindo um novo vendedor
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection(); // conecta com o banco

            st = conn.prepareStatement(
                "INSERT INTO seller "
                + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                + "VALUES "
                + "(?, ?, ?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS); // gera o id automático
            st.setString(1, "Carl Purple");
            st.setString(2, "carl@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("22/04/1930").getTime()));
            st.setDouble(4, 3500);
            st.setInt(5, 4);

            // quando é uma operação de alteração de dados, chamamos o método executeUpdate
            int rowsAffected = st.executeUpdate(); // comando para saber quantas linhas foram alteradas no banco de dados
            
            if(rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while(rs.next()) {
                    int id = rs.getInt(1); // valor da 1 coluna
                    System.out.println("Done! id = " + id);
                }
                System.out.println("Done! Rows affected: " + rowsAffected);

            } else {
                System.out.println("No rows affected!");
            }
            /*st = conn.prepareStatement ()
             *          "insert into department (Name) values ('D1'), ('D2'),"
             *          Statement.RETURN_GENERATED_KEYS);
            */
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
