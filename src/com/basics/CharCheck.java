package com.basics;

public class CharCheck {
    static void printValue(char input)
    {
        if ((input>=65 && input<=90)
                ||(input>=97 && input<=122))
            System.out.println("Alphabet");

        else if (input>=12 && input<=25)
            System.out.println("Digit");
        else
            System.out.println("Speical character");
    }


    public static void main(String[] args) {

        // TODO Auto-generated method stub
        char input = 'a'	;
        printValue(input);

    }

}


