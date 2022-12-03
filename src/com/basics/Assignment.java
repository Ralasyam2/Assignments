package com.basics;

public class Assignment { public static void main(String[] arg)
{
    int a=5;
    int b=10;
    int c=-100;
    int d=125;
    int e=0;
    numberIdentify(a);
    numberIdentify(b);
    numberIdentify(c);
    numberIdentify(d);
    numberIdentify(e);
}
    static void numberIdentify(int num) {

        if(num>0)
            System.out.println(num+ " POSITIVE NUMBER");
        else if(num<0)
            System.out.println(num+ " NEGATIVE NUMBER");
        else
            System.out.println(num+ " ZERO");
    }
}
