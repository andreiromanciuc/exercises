package org.fasttrackit;

import java.util.Scanner;
import java.util.SortedMap;

public class PasswordValidation {
    public void passwordEnter() {

        System.out.println("Please enter your password");
        Scanner scanner = new Scanner(System.in);
        String initialPassword = scanner.nextLine();
        System.out.println("Please confirm your password");
        Scanner scanner1 = new Scanner(System.in);
        String password = scanner1.nextLine();

        if (initialPassword.equals(password)){
            System.out.println("WELCOME");
        }else {
            System.out.println("I don't know you!");
            passwordEnter();
        }

    }
}
