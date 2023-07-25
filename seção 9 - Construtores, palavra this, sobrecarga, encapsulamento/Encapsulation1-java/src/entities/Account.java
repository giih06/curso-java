package entities;
public class Account {

    // como meus atributos sao privados, preciso colocar o get e set de cada um
    private int number; // numero da conta
    private String holder; // titular da conta
    private double balance; // saldo da conta

    // Construtores
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    // Getters e Setters
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder; 
    }

    public double getBalance() {
        return balance;
    }
   
    // Métodos
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5;
    }

    public String toString(){
        return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }

}
