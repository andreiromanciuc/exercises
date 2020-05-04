package org;


import org.calculations.SumEvenAndOdd;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SumEvenAndOdd sumEvenAndOdd = new SumEvenAndOdd();


        System.out.println("How many time you want to repeat?");
        Scanner scanner1 = new Scanner(System.in);
        int t = scanner1.nextInt();

        if (t <= 200 && t >= 1) {
            for (int i = 0; i < t; i++) {
                sumEvenAndOdd.sum();
                System.out.println(" ");
            }
        }else {
            System.out.println("introduce number from the range 1-200");

        }
    }

}

