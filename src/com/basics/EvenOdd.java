package com.basics;

public class EvenOdd {
    public static void main(String[] args) {
        int num=2;
        int num1=7;
        int num2=10;
        int num3=11;

        numberCheck(num);
        numberCheck(num1);
        numberCheck(num2);
        numberCheck(num3);
    }
    // TODO Auto-generated method stub
    static void numberCheck(int num) {
        if(num%2==0)
            System.out.println(num+" EVEN NUMBER");
        else
            System.out.println(num+" ODD NUMBER");

    }
}
