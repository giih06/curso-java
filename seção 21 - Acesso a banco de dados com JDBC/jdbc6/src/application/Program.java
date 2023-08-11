package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {
    // Programa para realizar uma transação entre dados do banco
    public static void main(String[] args) throws Exception {
         
		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false); //  cada operação isolada que voce fizer sera confirmada automaticamente(se valer verdadeiro).Se você colocar como falso significa que Cada operação não está confirmada automaticamento, só será confirmada com uma confirmação explícita do programador .

			st = conn.createStatement();
            
            // todo vendendor que percencer ao departamento 1 terá o salário atualizado para 2090
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

			// ERRO FAKE PRA TESTAR O TRY CATCH
			//int x = 1;
			//if (x < 2) {
			//	throw new SQLException("Fake error");
			//}
			
			// todo vendedor que pertencer ao departamento 2 terá o salário atualizado para 3090
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit(); // commit = confirmar a transação

			
			System.out.println("rows1 = " + rows1);
			System.out.println("rows2 = " + rows2);
		}
		catch (SQLException e) {
			try {
				// lógica para voltar a transação caso ela tenha parado no meio
				conn.rollback(); // rollback =  desfazer o que já foi feito
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} 
			catch (SQLException e1) {
				// lógica para quando der um erro no método rollback
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		} 
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
    }
}
