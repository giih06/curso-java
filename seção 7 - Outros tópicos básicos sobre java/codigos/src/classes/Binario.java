package classes;

import java.util.Scanner;
// testando um bit com código em binário
public class Binario {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int mask = 0b100000;
        int n = sc.nextInt(); 
        if ((n & mask) != 0) { // se a operação n "e" mask for verdadeira
        System.out.println("6th bit is true!");// tem um bit(1)
        }
        else {
        System.out.println("6th bit is false");// nao tem bit (0)
        }
        sc.close();
    }
}