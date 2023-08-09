package application;

import DAO.UsuarioDAO;
import entities.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario();
        u.setNome("Rogerio");
        u.setLogin("rogeio");
        u.setSenha("1234");
        u.setEmail("rogeio@gmail.com");
        new UsuarioDAO().cadastrarUsuario(u);
    }
}
