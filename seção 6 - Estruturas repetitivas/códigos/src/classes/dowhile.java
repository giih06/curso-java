package classes;

import java.util.Scanner;
import java.util.Locale;

public class dowhile {
public static void main(String[] args) throws Exception {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    char resp;
    do { // aparecerá na tela
    System.out.print("Digite a temperatura em Celsius: ");
    double C = sc.nextDouble();
    double F = 9.0 * C / 5.0 + 32.0;
    System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
    System.out.print("Deseja repetir (s/n)? ");
    resp = sc.next().charAt(0);
    } while (resp != 'n'); // depois irá testar para conferir se deve repetir os comandos da estrutura "do" ou parar.
    sc.close();    

    }
}
