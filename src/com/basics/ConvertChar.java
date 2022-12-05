package com.basics;

public class ConvertChar {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        char b;
        char a = 'a';
        if(Character.isLowerCase(a))
            b= Character.toUpperCase(a);
        else
            b= Character.toLowerCase(a);
        System.out.println(a+"->"+b);
    }

}

