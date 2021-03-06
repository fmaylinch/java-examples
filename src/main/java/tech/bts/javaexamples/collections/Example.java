package tech.bts.javaexamples.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {

    public static void main(String[] args) {

        //arrays();
        //lists();
        //myList();
        //myListWithStrings();
        maps();
    }

    private static void arrays() {

        // --- Arrays ---

        int[] ages; // arrays can use the primitive types: int, double, boolean, char
        String[] names; // array of String (or any other type)
        User[] users;

        int n = 10;
        names = new String[n]; // creates an array of n slots (with default values)

        names[0] = "Peter";
        names[1] = "Mary";
        names[2] = "Alex";

        System.out.println("First name is " + names[0]);
        System.out.println("I can store " + names.length + " names");
        System.out.println("Fourth name is " + names[3]);

        for (int i = 0; i < names.length; i++) {
            System.out.println("The name at position " + i + " is " + names[i]);
        }
    }

    private static void lists() {

        List<Integer> ages; // You can't use primitive types with List (only with arrays)
        // You have to use the wrapper classes: Integer, Double, Boolean, Character
        List<String> names;
        List<User> users;

        names = new ArrayList<>(); // creates an empty list

        System.out.println("The list has " + names.size() + " items");

        names.add("Peter");
        names.add("Mary");
        names.add("Alex");

        System.out.println("The list has " + names.size() + " items");

        for (int i = 0; i < names.size(); i++) {
            System.out.println("The name at index " + i + " is " + names.get(i));
        }
    }

    private static void myList() {

        MyList<Double> list = new MyLinkedList<>();

        list.add(2.5);
        list.add(10.0);
        list.add(3.7);
        list.add(4.0);

        System.out.println("The size is: " + list.size());
        System.out.println("The first value is: " + list.get(0));
        System.out.println("The second value is: " + list.get(1));
        System.out.println("The third value is: " + list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("The number at index " + i + " is " + list.get(i));
        }
    }

    private static void myListWithStrings() {

        MyList<String> list = new MyLinkedList<>();

        list.add("Peter");
        list.add("Mary");
        list.add("Alex");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " -> " + list.get(i));
        }
    }

    private static void maps() {

        Map<String, Integer> ages = new HashMap<>();

        ages.put("John", 30);
        ages.put("Alex", 20);
        ages.put("Mary", 15);

        int age = ages.get("Alex");
        System.out.println("The age of Alex is " + age);

        System.out.println("I have stored " + ages.size() + " values");
    }
}

class User {
    String name;
    int age;
}
