package org.calculations;

import java.util.Scanner;

public class CurrencyConversion {
Scanner scanner = new Scanner(System.in);
Scanner scanner1 = new Scanner(System.in);

public void conversion(){
    System.out.println("How much euros do you have?");
    double x = scanner.nextDouble();
    System.out.println("Which is the conversion rate?");
    double y = scanner1.nextDouble();

    System.out.println(x+ " euros at an exchange rate of " + y + " is " + Math.ceil((x*y)/100)/10 +" dollars.");
}

}
