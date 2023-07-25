package classes;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double total;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if(codigo == 1) {
            total = quantidade * 4;
        } else if(codigo == 2) {
            total = quantidade * 4.5;
        } else if(codigo == 3) {
            total = quantidade * 5;
        } else if(codigo == 4) {
            total = quantidade * 2;
        } else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
