package org.calculations;

import java.util.Scanner;

public class PizzaParty {
    Scanner pizza = new Scanner(System.in);
    Scanner people = new Scanner(System.in);

    public void party() {

        System.out.println("How many people?");
        int a = people.nextInt();
        System.out.println("How many pizzas do you have?");
        int b = pizza.nextInt();

        int c = b*8;

        System.out.println(a+" people with "+b+" pizzas.");
        System.out.println("Each person gets " +(c/a)+ " pieces of pizza.");
        System.out.println("There are "+(c%a) + " leftover pieces.");
    }

}
