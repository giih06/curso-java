package classes;
import java.util.Locale;
import java.util.Scanner;
public class expara04 {
    /*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
    segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel" */
public static void main(String[] args) throws Exception {

    Locale.setDefault(Locale.US); // , para .

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt(); // leu numero N

    for(int i=0; i<N; i++){ // vai ler N pares de números

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b == 0){
            System.out.println("Divisão impossível");
        } else {
            double div = (double) a / b; // divisão do primeiro par pelo segundo
            System.out.printf("%.1f%n", div); // resultado da divisão

        }
    }
    sc.close();

    }
}
