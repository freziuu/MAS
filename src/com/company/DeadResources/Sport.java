package com.company.DeadResources;

import com.company.ObjectPlus;
import com.company.TooSlowException;
import com.company.notALocalDate;

import java.util.Comparator;

public class Sport extends Vehicle{
    private Integer horsePower;
    static int minHorsePower = 300;
    public Sport(String brand, String model, int year, Double milage, Integer numberOfSeats, notALocalDate dateOfPurchase, Double price, Integer horsePower) {
        super(brand, model, year, milage, numberOfSeats, dateOfPurchase, price);
       if(horsePower < minHorsePower) throw new TooSlowException("U are too slow to be in a sports cars category! :D");
        this.horsePower = horsePower;
    }

    public static int getMinHorsePower() {
        return minHorsePower;
    }

    public static void setMinHorsePower(int minHorsePower) {
        Sport.minHorsePower = minHorsePower;
    }

    public static Sport findYoungestSportCar() throws ClassNotFoundException{
        var cars = ObjectPlus.getExtentOfClass(Sport.class);
        return ObjectPlus.getExtentOfClass(Sport.class).stream().max(Comparator.comparing(Sport::getYear)).get();
    }

    @Override
    public String toString() {
        return "Sport{" + super.toString() +
                ", horsePower = " + horsePower +
                '}';
    }
}
