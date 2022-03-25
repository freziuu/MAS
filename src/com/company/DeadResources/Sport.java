package com.company.DeadResources;

import com.company.TooSlowException;

import java.time.LocalDate;
import java.util.Date;

public class Sport extends Vehicle{
    private Integer horsePower;
    private Integer minHorsePower = 300;
    public Sport(String brand, String model, int year, Double milage, Integer numberOfSeats, LocalDate dateOfPurchase, Double price, Integer horsePower) {
        super(brand, model, year, milage, numberOfSeats, dateOfPurchase, price);
       // if(horsePower < minHorsePower) throw new TooSlowException("U are too slow to be in a sports cars category! :D");
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Sport{" + super.toString() +
                ", horsePower = " + horsePower +
                '}';
    }
}
