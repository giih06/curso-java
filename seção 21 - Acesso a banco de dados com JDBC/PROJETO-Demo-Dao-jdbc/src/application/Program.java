package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        // Instanciar um objeto dessa forma, o programa não conhece a implementação, mas sim a interface. Essa é uma forma de fazer uma ingeção de depenência sem explicitar a implementação
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}