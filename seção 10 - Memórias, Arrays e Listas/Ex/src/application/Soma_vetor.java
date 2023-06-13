package application;
import java.util.Locale;
import java.util.Scanner;
public class Soma_vetor {
    /* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
    - Imprimir todos os elementos do vetor
    - Mostrar na tela a soma e a média dos elementos do vetor */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0, media;

        System.out.print("Quantos numeros voce ai digitar? ");
        int n = sc.nextInt(); // quantidades de números no vetor

        // declarei o vetor
        double[] vetor = new double[n];


        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        // print dos valores entrados
        System.out.print("\nVALORES = ");
        for(int i=0; i<n; i++){
            System.out.printf("%.1f ", vetor[i]);
        }

        // cálculo da soma
        for(int i=0; i<n; i++){
            soma += vetor[i];
        }

        // cálculo da média
        media = soma / n;

        System.out.printf("\nSOMA = %.2f", soma);
        System.out.printf("\nMEDIA = %.2f", media);


        

        sc.close();
    }

}
