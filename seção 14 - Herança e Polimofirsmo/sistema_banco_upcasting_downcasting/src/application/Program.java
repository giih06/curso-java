package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Bruna", 0.0, 500);

        // UPCASTING

        Account acc1 = bacc; 
        Account acc2 = new BusinessAccount(1003, "Julio", 120, 250); // atribuindo um objeto da subclasse para a superclasse
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(120);
        // BusinessAccount acc5 = (BusinessAccount)acc3; ( da erro )( para evitar o erro teste da seguinte maneira:)
        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(300);
            System.out.println("Loan!");
        } // vai falhar o if já que o acc3 não é instancia do businessAccount

        if(acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }
}