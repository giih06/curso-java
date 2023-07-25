package entities;

public class Product {

// Atributos
public String name;
public double price;
public int quantity;

// Construtor padrão:
// Se voçê for criar um construtor personalizado, mas você ainda quer manter o construtor padrão, é só declarar ele da seguinte forma:
public Product(){

}

// Sobrecargas:
public Product(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}
public Product(String name, double price) {
    this.name = name;
    this.price = price;
}

// Métodos
public double totalValueInStock() {
    return price * quantity;
}
public void addProducts(int quantity) {
    this.quantity += quantity;
}
public void removeProducts(int quantity) {
    this.quantity -= quantity;
}
public String toString() {
    return name
    + ", $ "
    + String.format("%.2f", price)
    + ", "
    + quantity
    + " units, Total: $ "
    + String.format("%.2f", totalValueInStock());
}
}
