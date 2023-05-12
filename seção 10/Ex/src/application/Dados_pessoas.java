package application;

import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nmulheres, nhomens;
        double media, totalALturas, totalAlturasMulheres, mediaAlturaMulheres, menorAltura, maiorAltura;

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

        // Calculando a menor altura total
        npessoas, totalalturas
        for(int i=0; i<n; i++) {
            totalalturas += alturas[i];
        }


    }
}
