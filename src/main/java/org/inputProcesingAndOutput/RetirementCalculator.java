package org.inputProcesingAndOutput;



import java.time.LocalDate;
import java.util.Scanner;

public class RetirementCalculator {
    Scanner age = new Scanner(System.in);
    Scanner retirementAge = new Scanner(System.in);



    public void retirement(){
        System.out.println("What is your current age?");
        int a = age.nextInt();
        System.out.println("At what age would you like to retire?");
        int b = retirementAge.nextInt();
        int c = b-a;

        System.out.println("You have "+ c  + " left until you can retire.");
        System.out.println("It's "+ LocalDate.now().getYear() + ", so you can retire in " +
                LocalDate.now().plusYears(c).getYear() );

    }
}
