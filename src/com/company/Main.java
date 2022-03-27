package com.company;

import com.company.DeadResources.ECO;
import com.company.DeadResources.Sport;
import com.company.DeadResources.Vehicle;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

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




// stworzenie przykładowych obiektów
        Vehicle bmwM5 = new Sport("BMW", "M5", 2021, 666.0, 5, LocalDate.of(2020, 12, 30), 1200.0, 301);
        Vehicle bmwM3WithNull = new Sport("BMW", "M3", 2022, 202.0, 5, LocalDate.of(2021, 3, 2), null, 401);

        Vehicle toyotaYaris = new ECO("Toyota", "Yaris", 2020, 3000.0, 4, LocalDate.of(2019, 4, 20), 500.0);
            System.out.println("-------------------------");

// atr. złożony
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

// atr. pochodny


// met. klaswowa


    }
}
