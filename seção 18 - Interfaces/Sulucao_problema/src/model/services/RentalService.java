package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
    // attributes
    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;
    
    // constructors
    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }
    
    // methods

    // generate car rental invoice    
    public void processInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getEnd()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if(hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours); // Math.ceil round the hours up
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
