package com.company.RentalCompanyManagment;

import com.company.DeadResources.Vehicle;
import com.company.HumanResources.Client;
import com.company.HumanResources.Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class RentalAssistant {

    private static int numbersOfRents = 1; // not sure if correct
    Date rentalFromDate;
    Date rentalToDate;
    Employee employeeWhoRent;
    Client clientWhoRent;
    Vehicle vehicleWhichRent;
    Double price; // to do
    boolean containInsurance; // to do


    public RentalAssistant(Date reantalFromDate, Date rentalToDate, Employee employeeWhoRent, Client clientWhoRent, Vehicle vehicleWhichRent) {
        this.rentalFromDate = reantalFromDate;
        this.rentalToDate = rentalToDate;
        this.employeeWhoRent = employeeWhoRent;
        this.clientWhoRent = clientWhoRent;
        this.vehicleWhichRent = vehicleWhichRent;
        numbersOfRents++;

    }
}
