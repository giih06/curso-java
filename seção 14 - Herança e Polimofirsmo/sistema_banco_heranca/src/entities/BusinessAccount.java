package entities;
// herança da clase account
public class BusinessAccount extends Account{ // subclasse
        // atributo
        private double loanLimit;

        // Construtor
        public BusinessAccount(){
            super();
        }
        
        // reaproveitar o construtor com argumentos da superclasse Account
        public BusinessAccount(Integer number, String holder, double balance, double ioanLimit) {
            super(number, holder, balance); // chama o construtor da super classe
            loanLimit = ioanLimit;
        }
        
        // getters e setters
        public double getIoanLimit() {
            return loanLimit;
        }

        public void setIoanLimit(double ioanLimit) {
            loanLimit = ioanLimit;
        }

        // metodo
        public void loan(double amount) {
            if(amount <= loanLimit) {
                balance += amount - 10;
            }
        }
}
