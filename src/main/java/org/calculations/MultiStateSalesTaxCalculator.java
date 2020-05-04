package org.calculations;



import java.util.Scanner;

public class MultiStateSalesTaxCalculator {


    public void calculate(){


        String cluj = "Cluj";
        String alba = "Alba";
        String bihor = "Bihor";

        System.out.println("Introduce your state");
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();



        System.out.println("Introduce the amount");
        Scanner scanner3 = new Scanner(System.in);
        double amount = scanner3.nextDouble();
        double subtotal;
        double total;
        double tax;

        if (cluj.equals(c)){
            tax = 0.5;
            total = amount + tax;
            System.out.println("Tax: "+tax);
            System.out.println("Total: "+total);
        } else if (alba.equals(c)){
            tax = 2;
            total = amount + tax;
            System.out.println("Tax: "+tax);
            System.out.println("Total: "+total);
        }else if (bihor.equals(c)){
            tax = 3;
            total = amount + tax;
            System.out.println("Tax: "+tax);
            System.out.println("Total: "+total);
        }else {
            System.out.println("Please introduce valid number");
            calculate();
        }
    }

}
