package org.dataStructures;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Magic8Ball {

    List<String> answers = new ArrayList<>();

    public void getAnswers() {
        System.out.println("What's your question?");
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();

        String yes = "Yes";
        String no = "No";
        String maybe = "Maybe";
        String later = "“Ask again later.";

        answers.add(yes);
        answers.add(no);
        answers.add(maybe);
        answers.add(later);

        System.out.println(answers.get(ThreadLocalRandom.current().nextInt(1,4)));
        System.out.println("");
        System.out.println("Ask again later.");

    }

}
