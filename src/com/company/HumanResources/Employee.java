package com.company.HumanResources;

public class Employee extends Person{
    public Employee(String name, String surname, String gender, int age, String adress, String phoneNumber, String email) {
        super(name, surname, gender, age, adress, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", adress='" + homeAdress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
