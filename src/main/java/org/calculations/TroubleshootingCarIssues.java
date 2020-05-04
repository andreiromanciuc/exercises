package org.calculations;

import java.util.Scanner;

public class TroubleshootingCarIssues {

    public void trouble() {
        System.out.println("Answer y - for 'Yes', n - for 'No'");

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Is the car silent when you turn the key?");
        try {
            if (scanner.nextLine().equals("y")) {
                System.out.println("Are the battery terminals corroded?");
                Scanner scanner1 = new Scanner(System.in);

                if (scanner1.nextLine().equals("y")) {
                    System.out.println("Clean terminals and try starting again.");
                } else if (scanner1.nextLine().equals("n")) {
                    System.out.println("Replace cables and try again.");
                }
            } else if (scanner.nextLine().equals("n")) {
                System.out.println("Does the car make clicking noise?");
                Scanner scanner1 = new Scanner(System.in);
                if (scanner1.nextLine().equals("y")) {
                    System.out.println("Replace the battery.");
                } else if (scanner1.nextLine().equals("n")) {
                    System.out.println("Does the car crank up but fail to start?");
                    Scanner scanner2 = new Scanner(System.in);
                    if (scanner2.nextLine().equals("y")) {
                        System.out.println("Check spark plug connections.");
                    } else if (scanner2.nextLine().equals("n")) {
                        System.out.println("Does the engine start and then die?");
                        Scanner scanner3 = new Scanner(System.in);
                        if (scanner3.nextLine().equals("y")) {
                            System.out.println("Does your car have fuel injection?");
                            Scanner scanner4 = new Scanner(System.in);
                            if (scanner4.nextLine().equals("y")) {
                                System.out.println("Get it in for service.");
                            } else if (scanner4.nextLine().equals("n")) {
                                System.out.println("Check to ensure the choke is opening and closing.");
                            }
                        }
                    }
                }
            }
        }catch (IndexOutOfBoundsException exceptions){
            System.out.println("introduce just y or n");
        }
    }
}

