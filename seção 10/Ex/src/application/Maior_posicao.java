package application;
import java.util.Locale;
import java.util.Scanner;
public class Maior_posicao {
    /* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver  empates). Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero). */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posicaomaiorn;
        double maior;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        // declarando o vetor
        double[] vetor = new double[n];

        // Captando os números do vetor
        for(int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        // Calculando o maior valor
        maior = vetor[0];
        posicaomaiorn = 0;
        for(int i=0; i<n; i++) {
            if(vetor[i] > maior) {
                maior = vetor[i];
                posicaomaiorn = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIO VALOR = %d", posicaomaiorn);

        sc.close();
    }
}