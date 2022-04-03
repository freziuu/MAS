package com.company;

import com.company.DeadResources.ECO;
import com.company.DeadResources.Sport;
import com.company.DeadResources.Vehicle;
import com.company.HumanResources.Client;
import com.company.HumanResources.Employee;
import com.company.HumanResources.Person;
import com.company.RentalCompanyManagment.RentalAssistant;

import java.io.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        /*
         - Ekstensja
         - Eks = trwałość

         - atr. złożony = data zakupu
         - atr opcjonalny =
         - atr powt
         - atr klasowy
         - atr pochodny
         - met klasowa
         - przesłonięcie, przeciązenie
         */


    String nameOfSerializedFile = "mp1.bin";
    notALocalDate GOWNO = new notALocalDate(13, 1,2012);




// stworzenie przykładowych obiektów
        Person clientNew = new Client("Danda", "Bonk", "IDK", 59, "Marszalkowsa 21", "99833299", "asodkoa@wp.pl");
        Person empNew = new Employee("Vlad", "Durko", "idk", 21, "Dolna 2 ", "232323232", "ajdwoiadwo@gmail.com");
        Vehicle bmwM5 = new Sport("BMW", "M5", 2021, 666.0, 5, LocalDate.of(2020, 12, 30), 1200.0, 301);
        Vehicle bmwM3WithNull = new Sport("BMW", "M3", 2022, 202.0, 5, LocalDate.of(2021, 3, 2), null, 401);
        Vehicle toyotaYaris = new ECO("Toyota", "Yaris", 2020, 3000.0, 4, LocalDate.of(2019, 4, 20), 500.0);

        RentalAssistant test = new RentalAssistant(LocalDate.of(2000, 12, 20), LocalDate.of(2002, 12, 20), (Employee) empNew, (Client) clientNew, bmwM5, 40000.0);

            System.out.println("-------------------------");

// atr. złożony nie moze byc lokaldate

        System.out.println("Atrybut złożony: " + bmwM5.getDateOfPurchase());
            System.out.println("-------------------------");

// atr. opcjonalny
        System.out.println(bmwM5.getPriceForDay());
        System.out.println(bmwM3WithNull.getPriceForDay());
        System.out.println(bmwM3WithNull);
            System.out.println("-------------------------");

// atr. powtarzalny
        bmwM5.getMapOfMilages();

        bmwM5.updateMilage(LocalDate.of(2020,12,11 ),1.0);
        bmwM5.updateMilage(LocalDate.of(2020,12,5 ),2.0);
        bmwM5.updateMilage(LocalDate.of(2020,12,4 ),3.0);
        bmwM5.updateMilage(LocalDate.of(2020,12,3 ),4.0);
        bmwM5.updateMilage(LocalDate.of(2020,12,2 ),5.0);

        bmwM5.getMapOfMilages();
            System.out.println("-------------------------");
// atr. klasowy
        System.out.println(Sport.getMinHorsePower());
            System.out.println("-------------------------");
// atr. pochodny

        test.getDays();
            System.out.println("-------------------------");
// met. klaswowa

        try {
            System.out.println(Sport.findYoungestSportCar());
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("-------------------------");

// przeciazenie

    clientNew.givePromo();
        System.out.println(clientNew.getPromo());
    clientNew.givePromo(20);
        System.out.println(clientNew.getPromo());

        System.out.println("-------------------------");
// przysloniecie

        System.out.println(bmwM5.toString());

        System.out.println("-------------------------");
// serializacja

     System.out.println("Serializacja ekstensji:");

        try (
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nameOfSerializedFile));
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nameOfSerializedFile))
        ) {
            ObjectPlus.writeExtents(objectOutputStream);
            ObjectPlus.readExtents(objectInputStream);

            var extent = ObjectPlus.getExtentOfClass(RentalAssistant.class);
            extent.forEach(System.out::println);

            var extentEmp = ObjectPlus.getExtentOfClass(Employee.class);
            extentEmp.forEach(System.out::println);

            System.out.println("----");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
