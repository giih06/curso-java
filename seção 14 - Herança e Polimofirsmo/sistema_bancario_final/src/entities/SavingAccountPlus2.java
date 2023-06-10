package entities;
public class SavingAccountPlus2 extends SavingsAccount2 {
    
    
    @Override
    public void withdraw(double amount) {
        balance -= amount + 2.0;
    }
}
