package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0; // função que retorna um booleano
	}
}