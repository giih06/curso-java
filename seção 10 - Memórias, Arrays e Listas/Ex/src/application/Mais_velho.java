package application;

import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {
    /* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome da pessoa mais velha.  */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, maioridade, posicaomaior;
        // Quantidade de pessoas que serão informadas o nome e idade
        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        int[] idades = new int[n];
        String[] nomes = new String[n];
        // Especificação das pessoas
        for(int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa:\n", (i + 1));
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        // Calculando a pessoa mais velha
        maioridade = idades[0];
        posicaomaior = 0;
        for(int i=0; i<n; i++) {
            if(idades[i] > maioridade) {
                maioridade = idades[i];
                posicaomaior = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s", nomes[posicaomaior]);

        sc.close();
    }
}
