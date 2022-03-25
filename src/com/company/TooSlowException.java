package com.company;

public class TooSlowException extends RuntimeException{
    public TooSlowException(){

    }
    public TooSlowException(String msg){
        super(msg);
    }
}
