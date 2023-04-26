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



        sc.close();
    }
}
