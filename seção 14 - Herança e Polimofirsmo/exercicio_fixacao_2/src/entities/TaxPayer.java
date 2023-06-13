package entities;

public abstract class TaxPayer {

    // atributos
    private String name;
    private Double anualIncome;

    // construtores
    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    // getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }   

    // metodos
    
    // por possuir 'abstract' não pode ser instanciada
    public abstract Double tax();

    

    
}
