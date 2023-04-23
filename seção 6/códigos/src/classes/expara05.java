package classes;
import java.util.Scanner;
public class expara05 {
    /* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    Lembrando que, por definição, fatorial de 0 é 1*/
public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int fat = 1; // fatorial é um

    for(int i=1; i<=N; i++){
        fat *= i; // vai multiplicar o valor antecessor pelo sucessor ate chegar no N
    }
    System.out.println(fat);
   

    sc.close();

    }
}
