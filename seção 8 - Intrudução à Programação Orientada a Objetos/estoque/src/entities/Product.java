package entities;

public class Product {

    // Declarando os atributos
    public String name;
    public double price;
    public int quantity;

    // Declarando as funções (métodos)
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        // this é uma palavra reservada que significa uma auto referência para o objeto; this.quantity é pra especificar que quero acessar o atributo da classe
        this.quantity += quantity;
        // int quantity seria o valor adicionado e o this.quantity o valor antigo
    }

    // int quantity seria o argumento da função
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    // Como a minha classe product também é um object,estou sobrepondo a operação toString padrão que já vem no object. entao dentro desses{ } vou poder implementar a minha versão do toString
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }

}
