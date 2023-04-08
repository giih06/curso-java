package classes;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    decimais */

    public static void main(String[] args)  {
        // numero de funcionarios, seu n de horas trabalhadas e valor por hora, salario
        Locale.setDefault(Locale.US); //é obrigatório esse comando estar na primeira linha do código
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = valorHora * horas;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();

    }
}
