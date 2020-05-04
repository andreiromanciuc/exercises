package org.dataStructures;


import java.util.*;

public class FilteringValues {

    public void takeTheEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce the numbers: ");

        String string = scanner.nextLine();
        String trim = string.replaceAll("\\s", "");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= trim.length(); i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
        numbers.remove(0);
        System.out.println("Even numbers are: "+numbers);
    }
}
