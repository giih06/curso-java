package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle; // importando a classe
public class Compoo {
    /* O que aprendi na aula:
     * Classe é a definição do tipo
     * Objetos são instâncias da classe
     */
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando as variáveis x e y do tipo Triangle
        Triangle x, y;

        // Criando os objetos
        x = new Triangle(); 
        y = new Triangle();


        System.out.println("Enter the measures of triangle X: ");

        // Ler o número inteiro e guardar no atributo 'a' do objeto 'x'
        x.a = sc.nextDouble();
        // Ler o número inteiro e guardar no atributo 'b' do objeto 'x'
        x.b = sc.nextDouble();
        // Ler o número inteiro e guardar no atributo 'c' do objeto 'x'
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");

        // Ler o número inteiro e guardar no atributo 'a' do objeto 'y'
        y.a = sc.nextDouble();
        // Ler o número inteiro e guardar no atributo 'b' do objeto 'y'
        y.b = sc.nextDouble();
        // Ler o número inteiro e guardar no atributo 'c' do objeto 'y'
        y.c = sc.nextDouble();

        // Cálculos da área do triangulo x e y
        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
