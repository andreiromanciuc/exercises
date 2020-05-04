package org.inputProcesingAndOutput;


import java.util.Scanner;

public class SimpleMath {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);

    public void scan () {

        System.out.println("Which is the first number? ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Which is the second number? ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }


}
