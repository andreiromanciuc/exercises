package org.dataStructures;

import java.util.*;

public class ComputingStatistics {
    public void getStatistics() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> square = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int difference = 0;
        int y = 0;
        double root = 0;


        for (int i = 0; i <= numbers.size(); i++) {
            System.out.print("Enter a number: ");
            String sc = scanner.nextLine();
            if (sc.equals("done")) {
                break;
            }
            int x = Integer.parseInt(sc);
            numbers.add(x);
        }


        System.out.println("");
        System.out.print("Numbers: ");
        for (int i = 0; i< numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
                sum += numbers.get(i);
                difference = (i*i)-i;
                y = i*i;
            double y1 = Double.valueOf(y);
            double y2 = y1*y1;
            root = Math.sqrt(y2);

        }

        System.out.println("");
        int avg = sum/numbers.size();

        System.out.println("The average is: "+ avg+".");

        System.out.println("The minimum is "+ Collections.min(numbers)+".");
        System.out.println("The maximum is "+ Collections.max(numbers)+".");
        System.out.println("The standard deviation is "+root);

    }
}
