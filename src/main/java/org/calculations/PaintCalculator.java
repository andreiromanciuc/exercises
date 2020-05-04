package org.calculations;

import java.util.Scanner;

public class PaintCalculator {
    Scanner length = new Scanner(System.in);
    Scanner width = new Scanner(System.in);

    public void square (){
        System.out.println("Please introduce the length of the room");
        double a = length.nextDouble();
        System.out.println("Please introduce the width of the room");
        double b = width.nextDouble();


        double squareFeet = a*b;
        double gallon = squareFeet/350;

        int gallonInt = (int)Math.ceil(gallon);

        System.out.println("You will need to purchase " + gallonInt + " gallons of paint to cover "
                + squareFeet + " square feet.");

    }
}
