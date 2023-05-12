package application;
import java.util.Locale;
import java.util.Scanner;
public class Numeros_pares {
    /* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.  */

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qntpar;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        int[] vetor = new int[n]; // n é a quantidade de elementos que terá no vetor

        // Captando os números do vetor
        for(int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        // Calculando os numeros pares
        qntpar = 0;
        System.out.println("\nNUMEROS PARES: ");
        for(int i=0; i<n; i++) {
            if(vetor[i] % 2 == 0){
                System.out.printf("%d ",vetor[i]); // %d representa numeros inteiros
                qntpar++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d ", qntpar);

        sc.close();
    }
}

