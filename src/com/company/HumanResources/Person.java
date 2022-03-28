package com.company.HumanResources;

import com.company.ObjectPlusPlus;

abstract public class Person extends ObjectPlusPlus {
    private static int numberOfPersons = 1; // not sure if correct
    String name;
    String surname;
    String gender;
    int age;
    String homeAdress;
    String phoneNumber;
    String email;

    public Person(String name, String surname, String gender, int age, String homeAdress, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.homeAdress = homeAdress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        numberOfPersons++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return homeAdress;
    }

    public void setAdress(String adress) {
        this.homeAdress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void givePromo() {
    }

    public void givePromo(int i) {
    }

    public int getPromo() {
        return 0;
    }
}

