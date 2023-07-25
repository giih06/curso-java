package classes;

import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); 
        
        */

        //exercício de fixação
        String product1 = "Computer", product2 = "Office desk";
        int code = 5290, age = 30;
        char gender = 'F';
        double price1 = 2100.0, price2 = 650.50, measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is R$ %.2f%n", product1, price1);
        System.out.printf("%s, wich price is %.2f%n", product2, price2);
        System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);
        System.out.printf("%nMeasue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded : %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
        

    }
}
