package com.company.HumanResources;

public class Client extends Person{
    public Client(String name, String surname, String gender, int age, String adress, String phoneNumber, String email) {
        super(name, surname, gender, age, adress, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Client{" +
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
