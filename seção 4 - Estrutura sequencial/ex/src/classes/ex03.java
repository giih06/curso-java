package classes;

import java.util.Scanner;

public class ex03 {
    /*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
        
        sc.close();
    }
}
