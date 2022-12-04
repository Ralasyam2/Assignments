package com.basics;

import java.io.IOException;

public class ExceptionDemo {

    public static void main (String[] args){
        int a=10;
        int b=0;
        //int c=a/b;
        try{
            throw new IOException("something Happened");

        }
        catch (IOException e){
            System.out.println("Io Exception");
        }

      //  System.out.println(c);


    }
}







