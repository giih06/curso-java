package classes;

import java.util.Scanner;

public class ex03 {
    /*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
    ordem crescente ou decrescente. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A, B; // Declarando as variáveis
        A = sc.nextInt(); // Entrada do valor de A
        B = sc.nextInt(); // Entrada do valor de B
        if (A % B == 0 || B % A == 0){ // se o resto da divisão de A por B for 0 ou o resto da divisão de B por A for zero, então execute:
            System.out.println("SÂO MÙLTIPLOS");
        } else { // se não:
            System.out.println("Não são múltiplos");
        }
        sc.close();
    }
}
