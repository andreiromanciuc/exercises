package org.dataStructures;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PickingAWinner {

    public void pickingWinner() {


        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= names.size(); i++) {
            System.out.print("Enter a name: ");

            String sc = scanner.nextLine();
            names.add(sc);

            if (sc.equals("stop")) {
                System.out.println("The winner is...");
                System.out.println(names.get(ThreadLocalRandom.current().nextInt(0, names.size()-1)));
                break;
            }
        }
    }

}
