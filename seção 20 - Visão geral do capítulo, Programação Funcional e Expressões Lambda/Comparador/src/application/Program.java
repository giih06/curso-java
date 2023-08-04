package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())); // a função sort muda a ordem classificando cada elemento pela odem alfabética / dentro da função sort tem uma expressão lambda, que é uma função anônima

		for (Product p : list) {
			System.out.println(p);
		}
	}
}