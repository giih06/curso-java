package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class Program {
    // Programa para deletar o id da tabela
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement st = null;
        try {

            conn = DB.getConnection();

            st = conn.prepareStatement(
                "DELETE FROM department " // exclui de departamento
                + "WHERE " // onde (restrição)
                + "Id = ?"); // o Id
            
            // definir o departamento a ser deletado
            st.setInt(1, 4);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows Affected : " +  rowsAffected);

        }
        catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
