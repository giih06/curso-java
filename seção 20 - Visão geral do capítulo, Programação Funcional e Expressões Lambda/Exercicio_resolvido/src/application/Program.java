package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x,y) -> x + y) / list.size(); // Stream com a soma de todos os preços da lista dividido pelo tamanho da lista (preço médio dos produtos)

			System.out.println("Average price: " + String.format("%.2f", avg));
			
			// Esse Comparator é uma função que compara 2 Strings
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg) // filtrei todos os preços abaixo da média
					.map(p -> p.getName()).sorted(comp.reversed()) // criei uma nova stream contendo os nomes dos produtos filtrados / O .sorted ordena classificando cada elemento pela ordem alfabética / O .reversed reverte a ordem alfabética de traz para frente
					.collect(Collectors.toList()); // Transforma a String em lista
			
			names.forEach(System.out::println); // Para cada nome, sysout !

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}