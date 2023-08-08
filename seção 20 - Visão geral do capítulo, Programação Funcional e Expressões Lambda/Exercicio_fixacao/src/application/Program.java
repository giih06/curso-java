package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

// Fazer um programa para ler os dados (nome, email e salário)de funcionários a partir de um arquivo em formato .csv.

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            // criei a lista
            List<Employee> list = new ArrayList<>();
            
            // Lê cada linha da lista
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
//Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor fornecido pelo usuário.
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            List<String> emails = list.stream()
                    .filter(x -> x.getSalary() > salary) // filtrei todos os salários maiores que o salary que o usuário digitou
                    .map(x -> x.getEmail()) // peguei nome do email
                    .sorted()// o ordenei em ordem alfabética
                    .collect(Collectors.toList());
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ": ");
            emails.forEach(System.out::println); // Para cada elemento do emails é imprimido na tela

// Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.
            
            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M') // filtrei todos os nomes que começam com a letra M
                    .map(x -> x.getSalary()) // peguei o salário deles
                    .reduce(0.0, (x,y) -> x + y); // somei o salário deles
            System.out.println("Sum of salary from people whose name starts with 'M' : " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
