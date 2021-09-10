package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println( "Press C to convert from Fahrenheit to Celsius. " );
        System.out.println("Press F to convert from Celsius to Fahrenheit. ");
        System.out.print("Your choice: ");
        String convert = input.next();
        if (convert.equals("C") || convert.equals("c")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int temp = input.nextInt();
            int newTemp = (temp - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + newTemp + ".");
        }
        if (convert.equals("F") || convert.equals("f")) {
            System.out.print("Please enter the temperature in Celsius: ");
            int temp = input.nextInt();
            int newTemp = (temp * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + newTemp + ".");
        }
    }
}
