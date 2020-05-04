package org.inputProcesingAndOutput;

import java.util.Scanner;

public class CountingCharacters {
    Scanner name = new Scanner(System.in);

    public void length(){
        System.out.println("Please introduce your name.");
        String a = name.nextLine();
        System.out.println("The string "+ a +" have " + a.length() + " characters length");
    }

}
