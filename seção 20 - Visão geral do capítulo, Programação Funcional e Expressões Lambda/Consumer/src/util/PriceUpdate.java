package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpdate implements Consumer<Product> {

    // atualiza o preço do produto p, aumentando em 10%
	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}