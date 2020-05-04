package org.calculations;

import java.util.Scanner;

public class TemperatureConverter {
    public void convert(){
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        Scanner scanner = new Scanner(System.in);
        String c = "c";
        String f = "f";
        String e = scanner.nextLine();

        if (c.equals(e)){
            System.out.println("Please enter the temperature in Fahrenheit");
            Scanner scanner1 = new Scanner(System.in);
            double tempF = scanner1.nextDouble();
            double calculation = (tempF-32)*5/9;
            System.out.println("The temperature in Celsius is "+calculation);
        } else if (f.equals(e)){
            System.out.println("Please enter the temperature in Celsius");
            Scanner  scanner2 = new Scanner(System.in);
            double tempC = scanner2.nextDouble();
            double calculation = (tempC * 9/5)+32;
            System.out.println("The temperature in Fahrenheit is "+calculation);
        }else {
            System.out.println("You entered invalid character");
            convert();
        }

    }
}
