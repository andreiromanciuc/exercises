package org.inputProcesingAndOutput;


import java.util.Scanner;

public class MadLib {

    Scanner noun = new Scanner(System.in);
    Scanner verb = new Scanner(System.in);
    Scanner adjective = new Scanner(System.in);
    Scanner adverb = new Scanner(System.in);

    public void story (){
        System.out.println("Please insert a noun");
        String a = noun.nextLine();
        System.out.println("Please insert a verb");
        String b = verb.nextLine();
        System.out.println("Please insert an adjective");
        String c = adjective.nextLine();
        System.out.println("Please insert an adverb");
        String d = adverb.nextLine();
        System.out.println("Do you "+b+" your " + c +" "+a+" "+d+
                "? That's hilarious!");
    }


}
