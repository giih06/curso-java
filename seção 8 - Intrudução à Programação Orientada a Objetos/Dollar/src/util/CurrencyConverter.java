package util;

public class CurrencyConverter {
    // constantes
    public static double IOF = 0.06;

    // métodos
    public static double dollarToReal(double boughtDollar, double dollarPrice){
        return boughtDollar * dollarPrice * (1 + IOF);
    }
}
