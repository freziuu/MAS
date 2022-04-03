package com.company;

public class YouAreDumbException  extends RuntimeException{
    public YouAreDumbException(){

    }
    public YouAreDumbException(String msg){
        super(msg);
    }
}
