package com.company.DeadResources;

import java.time.LocalDate;
import java.util.Date;

public class ECO extends Vehicle{

    public ECO(String brand, String model, int year, Double milage, Integer numberOfSeats, LocalDate dateOfPurchase, Double price) {
        super(brand, model, year, milage, numberOfSeats, dateOfPurchase, price);
    }

    @Override
    public String toString() {
        return "ECO{" + super.toString() +
                '}';
    }
}
