package application;

import java.util.Locale;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nmulheres = 0, nhomens = 0;
        double totalAlturasMulheres = 0, mediaAlturaMulheres, menorAltura, maiorAltura;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] genero = new char[n];

        for(int i=0; i<n; i++) {
            System.out.printf("Altura da %da pessoa: ", i+1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i+1);
            genero[i] = sc.next().charAt(0);
        }

        // Calculando a menor e maior altura total
        menorAltura = alturas[0];
        maiorAltura = alturas[0];
        for(int i=0; i<n; i++) {
            if(alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if(alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
        }
        System.out.printf("Menor altura = %.2f", menorAltura);
        System.out.printf("\nMaior altura = %.2f", maiorAltura);

        // Calculando a media das alturas das mulheres e homens
        for(int i=0; i<n; i++) {
            if(genero[i]=='F') {
                totalAlturasMulheres += alturas[i];
                nmulheres++;
            } else {
                nhomens++;
            }
        }

        mediaAlturaMulheres = totalAlturasMulheres / nmulheres;

        System.out.printf("\nMedia das alturas das mulheres = %.2f", mediaAlturaMulheres);
        System.out.printf("\nNumero de homens = %d", nhomens);

        sc.close();
    }
}
