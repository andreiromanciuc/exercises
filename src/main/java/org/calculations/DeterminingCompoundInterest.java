package org.calculations;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class DeterminingCompoundInterest {
    Scanner scannerPrincipal = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);


    public void interest(){
        System.out.println("Enter the principal amount.");
        double principalAmount = scannerPrincipal.nextDouble();
        System.out.println("Enter the rate of interest.");
        double rate = scanner1.nextDouble();
        System.out.println("Enter the number of years.");
        double year = scanner2.nextDouble();
        System.out.println("What is the number of times the interest is compounded per year?");
        double compounded = scanner3.nextDouble();

        double ratePercent = rate/100;
        int year1 = (int)year;

        double calculation = (1+(ratePercent/compounded));
        double nt = compounded*year;
        double fin = Math.pow(calculation, nt);
        double power =  principalAmount*fin;

        System.out.println("$"+principalAmount+" invested at "+rate+ "% for " +
                year1+ " years compounded "+compounded+" times per year is $"+Math.ceil(power));
    }



}
