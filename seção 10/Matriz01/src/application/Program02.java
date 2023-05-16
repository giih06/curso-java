package application;

import java.util.Scanner;

public class Program02 {
    /* Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // ler as linhas e colunas
        int l = sc.nextInt();
        int c = sc.nextInt();

        // Declarando a matriz de l por c
        int[][] mat = new int[l][c];
        
        // lendo matriz
        for(int i=0; i<mat.length; i++) { //for percorrendo as linhas
            for(int j=0; j<mat[i].length; j++) { // for percorrendo as colunas
                mat[i][j] = sc.nextInt();
            }
        }

        // valor a ser procurado na matriz
        int x = sc.nextInt();

        // Localização desse número
        for(int i=0; i<mat.length; i++) { //for percorrendo as linhas
            for(int j=0; j<mat[i].length; j++) { // for percorrendo as colunas
                if(mat[i][j] == x) {  // se o valor da posição [i][j] da matriz for igual a x
                    System.out.println("Position " + i + "," + j); // imprimi a posição atual da matriz
                    if(j > 0) { // verifica se existe uma posição á esquerda de x
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if(j < mat[i].length-1) { // verifica se existe uma posição à direita de x
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if(i > 0) { // verifica se existe uma posição acima de x
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if(i < mat[i].length-1) { // verifica se eixste alguma posição abaixo de x
                        System.err.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }



        sc.close();
    }
}
