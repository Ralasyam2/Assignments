package com.basics;
//Runtime Exception
// Main class
public class PrinterNull {
    private String name;

    public void setName(String name) { //created setmethod to access String variable because string variable is private
        this.name = name;
    }

    public void print() {
        printString(name);
    }

    private void printString(String s) {
        System.out.println(s + " (" + s.length() + ")");  //throws an error due to checking illigal use of null variable length
    }
    // Main driver method
    public static void main(String[] args) {
        PrinterNull printer = new PrinterNull();
        printer.print();
    }
}