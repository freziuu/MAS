package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class notALocalDate {
    String date;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");



    public notALocalDate(int d, int m, int y){
        checkIfUserIsNotDumbASF(d,m,y);
        this.date = sdf.format(new Date(y-1900, m-1,d));
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







}
