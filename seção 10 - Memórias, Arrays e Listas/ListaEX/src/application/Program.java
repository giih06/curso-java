package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        // O tipo de cada obj da minha lista é Employee
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while(hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            // Instanciando os objetos digitados
            Employee emp = new Employee(id, name, salary);

            // Adicionando o obj emp na lista
            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int idsalary = sc.nextInt();
        // estou procurando a posição do idsalary dentro da lista, se encontrar significa que o pos n vao ser null
        Integer pos = position(list, idsalary);
        if (pos == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage : ");
            double percent = sc.nextDouble();

            // acessa o funcionario que está na posição pos  
            list.get(pos).increaseSalary(percent);
        }

        System.out.println("\nList of employees:");
        for (Employee emp : list) {
            System.out.println(emp);
        }
        sc.close();
    }

    // procura a posição do funcionário na lista
    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
