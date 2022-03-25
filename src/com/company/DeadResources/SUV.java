package com.company.DeadResources;

import java.time.LocalDate;
import java.util.Date;

public class SUV extends Vehicle{

    public SUV(String brand, String model, int year, Double milage, Integer numberOfSeats, LocalDate dateOfPurchase, Double price) {
        super(brand, model, year, milage, numberOfSeats, dateOfPurchase, price);
    }


    @Override
    public String toString() {
        return "SUV{" + super.toString() +
                '}';
    }
}
