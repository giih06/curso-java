package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
    /* Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos. */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double dollarPrice = sc.nextDouble(); // entrada do preço do dollar
        System.out.println("How many dollar will be bought?");
        double boughtDollar = sc.nextDouble(); // entrada da quantidade de dollar a ser comprado
        double result = CurrencyConverter.dollarToReal(boughtDollar, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f", result);

        sc.close();
    }
}
