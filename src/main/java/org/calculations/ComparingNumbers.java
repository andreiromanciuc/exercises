package org.calculations;

import java.util.Scanner;

public class ComparingNumbers {
    public void comparingNumbers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the second number");
        double b = scanner1.nextDouble();

        if (a>b){
            System.out.println("The largest number is "+a+".");
        }else {
            System.out.println("The largest number is "+b+".");
        }
    }
}
