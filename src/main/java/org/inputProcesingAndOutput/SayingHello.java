package org.inputProcesingAndOutput;


import java.util.Scanner;

public class SayingHello {


    public void hello(){
        System.out.println("Hello. What is your name?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome "+ scanner.nextLine());
    }


}
