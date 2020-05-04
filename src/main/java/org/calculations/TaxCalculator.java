package org.calculations;

import java.util.Scanner;

public class TaxCalculator {
    public void taxCalculator() {
        System.out.println("What is the order amount?");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        System.out.println("What is the state?");
        Scanner scanner4 = new Scanner(System.in);
        String wi = "wi";
        String wi2 = scanner4.nextLine();


        if (wi.equals(wi2)) {
            System.out.println("The subtotal is $" + amount);
            double tax = 0.55;
            System.out.println("The state is: " + wi.toUpperCase());
            System.out.println("The tax is $" + tax);
            System.out.println("The total is $" + (amount + tax));
        } else {
            System.out.println("The total is: " + amount);

        }
    }
}
