package org.calculations;

import java.util.Scanner;

public class LegalDrivingAge {

    public void drive(){
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 18){
            System.out.println("Your are not old enough to legally drive");
        } else {
            System.out.println("You are old enough to legally drive");
        }
    }
}
