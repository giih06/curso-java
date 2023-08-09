package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// método auxiliar para carrega as propriedades(dados) que estão salvas no arquivo db.properties e guarda-los dentro de um objeto específico(Properties)
public class DB {

    private static Connection conn = null;// objeto de conexão com o banco de dados do jdbc

    // método para conectar com o banco de dados
    public static Connection getConnection() {
        if(conn == null) { // se o obj conn tiver valendo nulo
            // código para conectar com o banco de dados
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");// url do banco de dados
                conn = DriverManager.getConnection(url, props); // peguei a propriedade e conectei com o banco de dados(instanciei um obj do tipo connection)
            } 
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    // método para fechar a conexão
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    
    // método para carregar as propriedades que estão definidas no arquivo db.properties
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs); // o comando loads faz a leitura do arquivo properties ( apontado pelo inputstream fs) e guarda os dados dentro do objeto props
            return props;
        } 
        catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }
}
