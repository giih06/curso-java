package util;
// Como a calculadora é apenas uma classe utilitária com operções e constantes estáticas, eu pude declarar todo mundo como estático e usar diretamente as operações e a constante através do nome da classe.
public class Calculator {

public static final double PI = 3.14159;

public static double circumference(double radius) {
return 2.0 * PI * radius;
}

public static double volume(double radius) {
return 4.0 * PI * radius * radius * radius / 3.0;
}

}
