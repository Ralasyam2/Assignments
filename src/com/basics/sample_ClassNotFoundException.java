package com.basics;
//Compile Time Exception
// Main class
public class sample_ClassNotFoundException {
    private static final String CLASS_TO_LOAD = "main.java.Utils";
    // Main driver method
    public static void main(String[] args) {
        try {
            Class loadedClass = Class.forName(CLASS_TO_LOAD);
            System.out.println("Class " + loadedClass + " found!");
        } catch (ClassNotFoundException ex) {
            System.err.println("ClassNotFoundException was found: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
