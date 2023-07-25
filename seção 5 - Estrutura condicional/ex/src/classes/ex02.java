package classes;

import java.util.Scanner;

public class ex02 {
    /*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // entrada de dados
        int x; // x atribuido a variavel int
        x = sc.nextInt(); // entrada de dados do valor x
        if (x % 2 == 0){// se o resto da divisao de x por 2 for 0:
            System.out.println("PAR");
        } else { // se não:
            System.out.println("IMPAR");
        }
        sc.close();//fechamento de tag
    }
}
