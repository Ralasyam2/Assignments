package com.basics;

public class NoValue {
    public static void main(String[] args)
    {

        // Checking if length of args array is greater than 0
        if (args.length > 0) {

            // Print statements
            System.out.println("The command line" + " arguments are:\n");

            // Iterating the args array using for each loop

            for (String val : args)

                // Printing command line arguments

                System.out.println(val);
        }

        else

            System.out.println("No command line " + "arguments found.");
    }
}

