package classes;

import java.util.Scanner;

public class Ler {
    public static void main(String[] args) {
        // Para ler um texto até a quebra de linha:
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // essa é a maneira correta para o código funcionar já que o x consome um next line igual as outras variáveis.
        s1 = sc.nextLine(); // para ler até a quebra de linhas
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
