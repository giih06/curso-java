package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    // Criando um vetor cujos elementos são objetos do tipo classe.
    /* Problema: Fazer um programa para ler um número inteiro N e os dados (nome e
    preço) de N Produtos. Armazene os N produtos em um vetor. Em
    seguida, mostrar o preço médio dos produtos.
 */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("AVERAGE PRICE %.2f", avg);
        

        sc.close();
    }
}
