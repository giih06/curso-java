package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        Department obj = new Department(1, "Books");
        
        // Instanciar um objeto dessa forma, o programa não conhece a implementação, mas sim a interface. Essa é uma forma de fazer uma ingeção de depenência sem explicitar a implementação
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), (double) 3000.0, obj);
        System.out.println(seller);
    }
}
