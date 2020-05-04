package org.calculations;

import java.util.Scanner;

public class SumEvenAndOdd {


    public void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce the number");
        int n = scanner.nextInt();

        int sumPair = 0;
        int sumUnpair = 0;

            if (n <= 10000 && n >= 1) {
                for (int i = 0; i < n; i++) {
                    if (i % 2 != 0) {
                        sumUnpair += i;

                    } else {
                        sumPair += i;

                    }
                }
                System.out.print(sumUnpair + " ");
                System.out.print(sumPair + " ");
            }else {
                System.out.println("introduce number from the range 1-10000");
                sum();
            }
    }
}
