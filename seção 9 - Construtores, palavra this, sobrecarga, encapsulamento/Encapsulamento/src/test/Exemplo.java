package test;
public class Exemplo {

    /* Padrão para implementação de getters e setters */

    /* a palavra "private" serve para dizer que esses atributos só podem ser acessados na própria classe */
    private String name;
    private double price;

    /* Caso eu precise acessar o nome do produto ou alterar o nome do produto, precisarei fazer métodos para isso. Por padrão, o método responsável por obter o atributo vai ser o método que vai ter o nome de get seguido do nome do atributo (em letra Maiuscula) */
    public String getName() {
    return name;
    }

    /* Caso eu precise alterar o valor do meu atributuo, precisarei usar o método set seguido do nome do atributo (em letra Maiúscula). Como esse método é para alterar o valor do atributo, ele não irá retornar nada (void) e terá que receber um valor para o atributo (String name). Recebendo esse valor, o método então vai atribuir para o atributo do objeto o valor recebido */
    public void setName(String name) {
    this.name = name;
    }

    public double getPrice() {
    return price;
    }

    public void setPrice(double price) {
    this.price = price;
    }

}
