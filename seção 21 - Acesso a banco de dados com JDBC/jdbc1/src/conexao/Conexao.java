package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // variável estática constante representando a url banco de dados
    private static final String url = "jdbc:mysql://localhost:3306/jdbc1";

    // variável responsável pelo usuário do banco de dados
    private static final String user = "root";
    private static final String password = "gigi123";

    // Criei um objeto do tipo connection
    private static Connection conn;

    // Criei um método estático que faz a verificação se a conexão já foi instanciada
    public static Connection getConexao() {
    try {
        if(conn == null) {
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } else {
            return conn;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
    }
}
