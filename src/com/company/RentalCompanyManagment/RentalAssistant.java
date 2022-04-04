package com.company.RentalCompanyManagment;

import com.company.DeadResources.Vehicle;
import com.company.HumanResources.Client;
import com.company.HumanResources.Employee;
import com.company.HumanResources.Person;
import com.company.ObjectPlusPlus;
import com.company.Roles;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;


public class RentalAssistant extends ObjectPlusPlus implements Serializable {

    private static int numbersOfRents = 1; // not sure if correct

    LocalDate rentalFromDate;
    LocalDate rentalToDate;
    Employee employeeWhoRent;
    Client clientWhoRent;
    Vehicle vehicleWhichRent;
    Double price; // to do
    boolean containInsurance; // to do


    public RentalAssistant(LocalDate reantalFromDate, LocalDate rentalToDate, Employee employeeWhoRent, Client clientWhoRent, Vehicle vehicleWhichRent, double price) {
        this.rentalFromDate = reantalFromDate;
        this.rentalToDate = rentalToDate;
        this.employeeWhoRent = employeeWhoRent;
        this.clientWhoRent = clientWhoRent;
        this.vehicleWhichRent = vehicleWhichRent;
        this.price = price;
        this.addLink(Roles.VEHICLE, Roles.RENTASIST, vehicleWhichRent);
        this.addLink(Roles.CLIENT, Roles.RENTASIST, clientWhoRent);
        this.addLink(Roles.EMP, Roles.RENTASIST, employeeWhoRent);

        numbersOfRents++;

    }

    public LocalDate getRentalFromDate() {
        return rentalFromDate;
    }

    public void setRentalFromDate(LocalDate rentalFromDate) {
        this.rentalFromDate = rentalFromDate;
    }

    public LocalDate getRentalToDate() {
        return rentalToDate;
    }

    public void setRentalToDate(LocalDate rentalToDate) {
        this.rentalToDate = rentalToDate;
    }

    public Employee getEmployeeWhoRent() {
        return employeeWhoRent;
    }

    public void setEmployeeWhoRent(Employee employeeWhoRent) {
        this.employeeWhoRent = employeeWhoRent;
    }

    public Client getClientWhoRent() {
        return clientWhoRent;
    }

    public void setClientWhoRent(Client clientWhoRent) {
        this.clientWhoRent = clientWhoRent;
    }

    public Vehicle getVehicleWhichRent() {
        return vehicleWhichRent;
    }

    public void setVehicleWhichRent(Vehicle vehicleWhichRent) {
        this.vehicleWhichRent = vehicleWhichRent;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isContainInsurance() {
        return containInsurance;
    }

    public void setContainInsurance(boolean containInsurance) {
        this.containInsurance = containInsurance;
    }

    public void getDays(){
        System.out.println(DAYS.between(this.rentalFromDate, this.rentalToDate));
    }
    @Override
    public String toString() {
        return "RentalAssistant{" +
                "rentalFromDate=" + rentalFromDate +
                ", rentalToDate=" + rentalToDate +
                ", employeeWhoRent=" + employeeWhoRent +
                ", clientWhoRent=" + clientWhoRent +
                ", vehicleWhichRent=" + vehicleWhichRent +
                ", price=" + price +
                ", containInsurance=" + containInsurance +
                '}';
    }
}
