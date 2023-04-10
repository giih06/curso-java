package classes;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x, y;
        x = sc.nextDouble();
        y = sc.nextDouble();
        if(x > 0 && y > 0){
            System.out.println("Q1");
        } else if(x < 0 && y >0){
            System.out.println("Q2");
        } else if(x < 0 && y < 0){
            System.out.println("Q3");
        } else if (x == 0 && y == 0){
            System.out.println("Origem");
        } else if(x == 0){
            System.out.println("Eixo X");
        } else if(y == 0){
            System.out.println("Eixo Y");
        } else {
            System.out.println("Q4");
        }

        sc.close();

    }
}
