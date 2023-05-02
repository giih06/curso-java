package entities;

public class Product {

    //atributos encapsulador (private)
    private String name;
    private double price;
    private int quantity;

    // Construtores
    public Product() {
    }

    public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters e Setters
    /* para acessar: get; para alterar: set */

    // acessa o nome do produto
    public String getName() {
        return name;
    }

    // aletra o valor do atributo name para o novo parâmetro name
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // acesse o valor da quantidade
    public int getQuantity() {
        return quantity;
    }

    // Métodos
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}