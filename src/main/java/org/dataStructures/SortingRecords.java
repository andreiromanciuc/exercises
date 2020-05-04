package org.dataStructures;



import java.util.*;

public class SortingRecords {

    public void createMaps() {
        Map<String, Object> person1 = new HashMap<>();
        Map<String, Object> person2 = new HashMap<>();
        Map<String, Object> person3 = new HashMap<>();
        Map<String, Object> person4 = new HashMap<>();
        Map<String, Object> person5 = new HashMap<>();
        Map<String, Object> person6 = new HashMap<>();

        person1.put("firstName", "John");
        person1.put("lastName", "Johnson");
        person1.put("position", "Manager");
        person1.put("separationDate", "2016-12-31");

        person2.put("firstName", "Tou");
        person2.put("lastName", "Xiong");
        person2.put("position", "Software Engineer");
        person2.put("separationDate", "2016-10-05");

        person3.put("firstName", "Michaela");
        person3.put("lastName", "Michaelson");
        person3.put("position", "District Manager");
        person3.put("separationDate", "2015-12-19");

        person4.put("firstName", "Jake");
        person4.put("lastName", "Jacobson");
        person4.put("position", "Programmer");
        person4.put("separationDate", "");

        person5.put("firstName", "Jacquelyn");
        person5.put("lastName", "Jackson");
        person5.put("position", "DBA");
        person5.put("separationDate", "");

        person6.put("firstName", "Sally");
        person6.put("lastName", "Weber");
        person6.put("position", "Web Developer");
        person6.put("separationDate", "2015-12-18");

        List<Map<String, Object>> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);

        persons.sort(new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                return ((String) o1.get("lastName")).compareTo((String) o2.get("lastName"));
            }
        });

        System.out.println("Name                 | Position              | Separation Date");
        System.out.println("--------------------------------------------------------------");
        for (Map<String, Object> print : persons) {
            Iterator<Map.Entry<String, Object>> iterator = print.entrySet().iterator();
            if (iterator.hasNext()) {
                Object firstName = print.get("firstName");
                Object lastName = print.get("lastName");
                Object position = print.get("position");
                Object separationDate = print.get("separationDate");
                System.out.printf("%-10s %-10s|\t %-20s|\t %-20s\t %n", firstName, lastName, position, separationDate);
            }
        }
    }
}
