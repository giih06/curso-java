package classes;

import java.util.Scanner;

public class ex01 {
    /* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x; // atribui a variável int para x
        x = sc.nextInt(); // entrada de dados para atribuir o valor  de x
        if (x >= 0){ // se x for maior ou igual a 0, execute esse bloco de comando
            System.out.println("POSITIVO");
        } else { // se não, execute esse bloco
            System.out.println("NEGATIVO");
        }
        sc.close(); // fechamento da tag scanner
    }
}
