package com.company;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class notALocalDate extends ObjectPlusPlus implements Serializable {
    String date;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");



    public notALocalDate(int d, int m, int y){
        checkIfUserIsNotDumbASF(d,m,y);
        this.date = sdf.format(new Date(y-1900, m-1,d));
    }

    public static int between(notALocalDate dateOfPurchase, notALocalDate now) {
        System.out.println(dateOfPurchase);
        System.out.println(now);
        return 0;
    }

    public static notALocalDate now() {
        return new notALocalDate(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
    }




    public void checkIfUserIsNotDumbASF(int d, int m, int y){
       if(0 >= m && m > 12){
           System.out.println("You cant even write correct date u fucking dumbass");
           throw new YouAreDumbException();
       } else if (d <= 0 || 31 < d){
           System.out.println("You cant even write correct date u fucking dumbass");
           throw new YouAreDumbException();
       }
    }




    @Override
    public String toString() {
        return "notALocalDate{" +
                "date='" + date + '\'' +
                '}';
    }


}
