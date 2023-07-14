package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    
    // attributes
    private LocalDate dueDate;
    private Double amount;

    private static 	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // constructors
    public Installment() {
    }

    public Installment(LocalDate date, Double amount) {
        this.dueDate = date;
        this.amount = amount;
    }

    // getter ans setter
    public LocalDate getDate() {
        return dueDate;
    }

    public void setDate(LocalDate date) {
        this.dueDate = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    // tostring
    @Override
    public String toString() {
        return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
    } 
}
