package com.company.DeadResources;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public abstract class Vehicle {
    private static int numberOfVehicles = 1; // not sure if correct
    private String brand;
    private String model;
    private int year;
    private final Map<LocalDate, Double> mapOfMilage = new TreeMap<>();
    private LocalDate dateOfPurchase;
    private Double priceForDay;
    private int numberOfSeats;




    public Vehicle(String brand, String model, int year, double milage, int numberOfSeats, LocalDate dateOfPurchase, Double priceForDay) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        updateMilage(LocalDate.now(), milage);
        this.numberOfSeats = numberOfSeats;
        this.dateOfPurchase = dateOfPurchase;
        this.priceForDay = priceForDay;
        numberOfVehicles++;
    }
    public void updateMilage(LocalDate date, Double milage){
        this.mapOfMilage.put(date, milage);
    }
    public void getMapOfMilages(){
        System.out.println(mapOfMilage);
    }

    public String checkIfPriceIsNull(Double price){
        Optional<Double> optionalDouble = Optional.ofNullable(price);
        return optionalDouble.isPresent() ? optionalDouble.toString() : "EMPTY";
    }
    private static int countForHowLong(Vehicle v){
        return Period.between(v.getDateOfPurchase(), LocalDate.now()).getYears();
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Double getPriceForDay() {
        return priceForDay;
    }

    public void setPriceForDay(Double priceForDay) {
        this.priceForDay = priceForDay;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", milage=" +
                ", dateOfPurchase=" + dateOfPurchase +
                ", priceForDay=" + checkIfPriceIsNull(priceForDay) +
                ", numberOfSeats=" + numberOfSeats +
                '}';
    }
}
