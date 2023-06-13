package entities;

public final class ImportedProduct extends Product {
    // atributos
    private Double customsFee;

    // construtores
    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    // Getters e setters
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    // métodos
    
    @Override // método sobreposto
    public final String priceTag() {
        return super.priceTag() + " (Customs fee: $ " + getCustomsFee() + ")";
    }
     

    
    






}
