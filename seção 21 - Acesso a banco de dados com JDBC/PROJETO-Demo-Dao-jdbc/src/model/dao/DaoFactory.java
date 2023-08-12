package model.dao;

import db.DB;
import model.dao.imp.SellerDaoJDBC;

// Essa classe terá operações estáticas para instanciar os Daos
public class DaoFactory {

    // A classe vai expor o método que retorna o tipo da interface, mas internamente ela vai estar instanciando uma implementação ( macete para não precisar expor a implementação, deixa somente a interface)
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
