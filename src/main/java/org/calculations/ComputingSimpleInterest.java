package org.calculations;

import java.util.Scanner;

public class ComputingSimpleInterest {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    public void interest(){
        System.out.println("Enter the principal.");
        double principal = scanner.nextDouble();
        System.out.println("Enter the rate of interest.");
        double rate = scanner1.nextDouble();
        System.out.println("Enter the number of years.");
        double year = scanner2.nextDouble();

        double ratePercent = rate/100;
        int year1 = (int)year;


        System.out.println("After " +year1+ " years at "+ rate +"%, the investment will be worth $" +
                principal*(1+(ratePercent*year)));

    }

}
