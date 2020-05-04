package org.calculations;


import java.util.Scanner;

public class SelfCheckout {
    Scanner price = new Scanner(System.in);
    Scanner quantity = new Scanner(System.in);
    public void subTotal() {


        System.out.println("Please insert the price of the product.");
        double a = price.nextDouble();
        System.out.println("Please insert the quantity of the product.");
        double b = quantity.nextDouble();
        System.out.println("Please insert the price of the product.");
        double c = price.nextDouble();
        System.out.println("Please insert the quantity of the product.");
        double d = quantity.nextDouble();
        System.out.println("Please insert the price of the product.");
        double e = price.nextDouble();
        System.out.println("Please insert the quantity of the product.");
        double f = quantity.nextDouble();

        double x = a * b;
        double z = c * d;
        double y = e * f;

        double sum = x + z + y;
        double tax = sum*0.0505;


        System.out.println("SubTotal: " + sum);
        System.out.println("Tax: "+ tax);
        System.out.println("Total: " + (sum + tax));
    }
}
