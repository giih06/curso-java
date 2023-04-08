package classes;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
    /*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
    casas decimais conforme exemplos. */
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159, raio, A;
        raio = sc.nextDouble();
        A = pi * Math.pow(raio,2);
        System.out.printf("A=%.4f%n", A);

        sc.close();
        
    }
}
