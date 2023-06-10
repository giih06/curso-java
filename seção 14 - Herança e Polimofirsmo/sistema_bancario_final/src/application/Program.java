package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex", 1000);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        // Testando sobreposição de metodos com @override
        Account acc2 = new SavingsAccount(1002, "Marie", 1000, 0.01);
        acc2.withdraw(200);
        System.out.println(acc2.getBalance());

        // Testando sobreposição de métodos com o super.
        Account acc3 = new BusinessAccount(1003, "Jorge", 1000, 500);
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());


    }
}