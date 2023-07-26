package application;
import java.util.Set;
import java.util.TreeSet;
import entities.Product;
public class Program {
    public static void main(String[] args) {

        // Quando se usa o Treeset, a classe do conjunto (Product) tem que ser um emplementação do Comparable para que seja possível o Treeset ordenar os objetos
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }
    }
}