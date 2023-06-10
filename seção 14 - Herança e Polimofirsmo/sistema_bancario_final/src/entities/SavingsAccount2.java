package entities;
public class SavingsAccount2 extends Account{
    // atributos
    private Double interestRate;
    
    // construtores
    public SavingsAccount2() {
        super();
    }

    public SavingsAccount2(Integer number, String holder, double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    // getter e setter
    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    // metodo

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override // indica ao compliador que esse método é uma sobreposição de método
    // Para garantir que o método withdraw de SavingsAccount2 não seja sobreposto, utilizamos a palavra "final" no método withdraw
    public final void withdraw(double amount) {
        balance -= amount;
    }

    

    
    
}
