package entities;

public class Product {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

    // O método estático trabalha com o Produto que for passado como argumento para ele
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}
    
    // vai trabalhar com o próprio objeto aonde está 
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}