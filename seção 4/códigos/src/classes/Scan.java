
package classes;
import java.util.Locale;
import java.util.Scanner;
public class Scan {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        System.out.println("voce digitou " + x);

        sc.close();



    }
}
