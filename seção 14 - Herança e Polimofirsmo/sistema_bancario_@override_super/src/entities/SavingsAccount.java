package entities;

public class SavingsAccount extends Account{
    // atributos
    private Double interestRate;
    
    // construtores
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, double balance, Double interestRate) {
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
    public void withdraw(double amount) {
        balance -= amount;
    }

    

    
    
}
