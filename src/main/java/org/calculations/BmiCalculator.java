package org.calculations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BmiCalculator {

    public void bmiCalculations () {
       try {
           System.out.println("Introduce you weight");

        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        System.out.println("Introduce your height");
        Scanner scanner1 = new Scanner(System.in);
        double height = scanner1.nextDouble();

        double bmi = weight/(height*height);
        if (18.5 <= bmi && bmi<=25){
            System.out.println("Your BMI is "+Math.ceil(bmi)/1);
            System.out.println("You are within the ideal weight range.");
        } else {
            System.out.println("Your BMI is "+Math.ceil(bmi)/1);
            System.out.println("You are overweight. You should see your doctor.");
        }
       } catch (InputMismatchException exception){
           System.out.println("Please introduce valid data");
           bmiCalculations();
       }
    }
}
