package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
    public static void main(String[] args) throws Exception {
        // preparar o banco, 
        Connection conn = null; // prepara o banco
        Statement st = null; // prepara uma consulta sql
        ResultSet rs = null; // guardar o resultado da consulta
        try {
            conn = DB.getConnection(); // conectei ao banco de dados

            st = conn.createStatement(); // consulta

            rs = st.executeQuery("select * from department"); // resultado

            while (rs.next()) {// irá funcionar enquanto existir o próximo dado
            System.out.println(rs.getString("Id") + ", " + rs.getString("Name")); // output do campo id e name
            }
        }
        catch (SQLException e) {
            e.printStackTrace();// Imprime no console o Strack Trace de erro
        }
        finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
