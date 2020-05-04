package org.calculations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BloodAlcoholCalculator {

    public void alcoholCalculator() {
        double r;
        System.out.println("Please enter your gender. (1 for male / 2 for female)");
        Scanner scanner = new Scanner(System.in);
        int gender = scanner.nextInt();

        System.out.println("How much did you drunk?");
        Scanner scanner1 = new Scanner(System.in);
        double a = scanner1.nextDouble();

        System.out.println("Introduce your body weight");
        Scanner scanner2 = new Scanner(System.in);
        double w = scanner2.nextDouble();

        System.out.println("Introduce the number of hours since the last drink");
        Scanner scanner3 = new Scanner(System.in);
        double h = scanner3.nextDouble();

        if (gender == 1) {
            double bac = ((a*5.14)/(w*0.73)-0.015*h);
            System.out.println("Your BAC is: "+ Math.ceil(bac)/100);
        } else if (gender == 2) {
            double bac = ((a*5.14)/(w*0.66)-0.015*h);
            System.out.println("Your BAC is: "+ Math.ceil(bac)/100);
        } else {
            System.out.println("Please enter valid number.");
            alcoholCalculator();
        }
    }

}
