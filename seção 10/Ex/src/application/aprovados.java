package application;
import java.util.Locale;
import java.util.Scanner;
public class Aprovados {
    /* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ouigual a 6.0 (seis). . */

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media;
        System.out.print("Quantos alunos serão digitados? ");
        n = sc.nextInt();
        // Vetores
        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for(int i=0; i<n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %so aluno:\n", i + 1);
            sc.nextLine();
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        // Alunos aprovados
        System.out.println("Alunos aprovados:");
        for(int i=0; i<n; i++){
            media = (nota1[i] + nota2[i]) / 2;
            if(media >= 6) {
                System.out.printf("%s\n", nomes[i]);
            }
        }
        sc.close();
    }
}