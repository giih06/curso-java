package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    /* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
 */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i=0; i<n; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        



        sc.close();

    }
}
