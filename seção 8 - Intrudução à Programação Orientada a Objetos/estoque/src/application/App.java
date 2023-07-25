package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    /*Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque) */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       Product product = new Product();

       //leitura dos dados
       System.out.println("Enter product data: ");
       System.out.print("Name: ");

       // faço a leitura do nome e guarde dentro da variável product no campo name
       product.name = sc.nextLine();

        System.out.print("Price: ");

        // faço a leitura do preço e guardo dentro da variável product no campo Price
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");

        // façp a leitura da quantidade em estoque e guardo dentro da variável product no campo quantity
        product.quantity = sc.nextInt();

        // operações (toString converte o objeto para string)
        // não preciso chamar o .toString já que o vscode detecta que o meu objeto está num contexto de um println que está esperando um string e implicitamente ele vai chamar o toString.
        System.out.println("\nProduct data: " + product);
        System.out.print("\nEnter the number of products to be added in stock:");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("\nUpdated data: " + product);
        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.print("\nUpdated data: " + product);



        sc.close();
    }
}
