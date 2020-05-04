package org.dataStructures;


import java.util.*;

public class EmployeeListRemoval {

    public void employeeRemoval() {

        List<String> employees = new ArrayList<>();

        String name = "Andrei Romanciuc";
        employees.add(name);

        String name1 = "Alex Cosmos";
        employees.add(name1);

        String name2 = "Albert Einstein";
        employees.add(name2);

        String name3 = "Ludovic Bethoveen";
        employees.add(name3);

        String name4 = "Carlos Sainz";
        employees.add(name4);

        int i;
        for (i = 0; i < employees.size(); i++) {
            System.out.println((i+1)+". "+ employees.get(i));
        }

        System.out.println("Delete the name you want");
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();

        employees.remove(sc);


        for (i=0; i<employees.size(); i++){
            System.out.println((i+1)+". "+ employees.get(i));
        }


    }
}
