package model.entities;

public class Invoice {
    
    // attributes
    private Double basicPayment;
    private Double tax;

    // consructors
    public Invoice() {
    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    // getters and setters
    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
 
    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }
    
}   
