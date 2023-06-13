package entities;

public final class Individual extends TaxPayer{
    // atributo
    private double healthExpenditures;

    // construtores
    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    // getters e setters

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    // metodos
    @Override
    public Double tax() {
        if(getAnualIncome() < 20000.00) {
            return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
        } else {
            return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
        
    }

    

    
}
