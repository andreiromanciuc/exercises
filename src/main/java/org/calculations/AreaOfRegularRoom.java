package org.calculations;

import java.util.Scanner;

public class AreaOfRegularRoom {
    Scanner length = new Scanner(System.in);
    Scanner width = new Scanner(System.in);

    public void square (){
        System.out.println("Please introduce the length. (feet)");
        double a = length.nextDouble();
        System.out.println("Please introduce the width. (feet)");
        double b = width.nextDouble();


        double squareFeet = a*b;
        double squareMeters = squareFeet * 0.09290304;


        System.out.println("You entered dimensions of "+ a + " feet by "+b+" feet.");
        System.out.println("The area is "+squareFeet+" square feet.");
        System.out.println("The area in square meters is " + squareMeters);
    }
}
