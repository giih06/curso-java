package application;
import java.util.Locale;
import java.util.Scanner;
public class Alturas {
    /* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
    bem como os nomes dessas pessoas caso houver. */

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nmenores;
        double alturaTotal, alturaMedia, percentualMenores;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        // Declarando os vetores
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        // Aplcando os vetores no laço for
        for(int i=0; i<n; i++){
            System.out.printf("Dados da %da pessoa: ", i + 1);
            System.out.print("\nNome: ");
            nomes[i] = sc.nextLine();
            System.out.print("\nIdade: ");
            idades[i] = sc.nextInt();
            System.out.print("\nAltura: ");
            alturas[i] = sc.nextDouble();
        }

        





        sc.close();
    }
}