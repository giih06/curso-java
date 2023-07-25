package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        // delcarando as variáveis
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        // entrada de dados
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.Tax = sc.nextDouble();

        // calculando os valores
        System.out.print("\nEmployee: " + emp + "\n");
        System.out.print("\nWhich percentage to increase salary?: ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.print("\nUpdated data: " + emp);

        sc.close();
    }
}
