package application;

import java.util.Scanner;

public class Program {
    /* Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // ler a variavel n
        int n = sc.nextInt();

        // Criando a matriz n por n
        // os [][] significa que é um vetor bidimensional(matriz)
        int[][] mat = new int[n][n];

        // lendo matriz
        for(int i=0; i<mat.length; i++) { //for percorrendo as linhas
            for(int j=0; j<mat[i].length; j++) { // for percorrendo as colunas
                mat[i][j] = sc.nextInt();
            }
        }

        // Diagonal principal
        System.out.print("Main diagonal :");
        for(int i=0; i<mat.length; i++) {
            System.out.println(mat[i][i] + " ");
        }
        System.out.println();

        // Números negativos
        int count = 0;
        for(int i=0; i<mat.length; i++) { // percorre as linhas
            for(int j=0; j<mat[i].length; j++) { // percorre as colunas
                if(mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.print("Negative numbers: " + count);
        sc.close();
    }
}
