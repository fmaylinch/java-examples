package tech.bts.javaexamples.simpleprogram;

import tech.bts.javaexamples.classes.MathUtil;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello");

        // Declare a variable
        int age;
        String name;

        // Assign a value
        age = 15;

        // Declare and assign
        double weight = 40.5;

        // if
        if (age >= 18) {
            System.out.println("adult");
        } else if (age >= 13) {
            System.out.println("teenager");
        } else {
            System.out.println("kid");
        }

        // while
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // for loop (`fori` shortcut)
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        // Create an empty list and add values
        List<String> names = new ArrayList<>();
        names.add("potato");
        names.add("carrot");

        System.out.println( names.get(0) );

        // Create a immutable list with some values
        List<Integer> numbers =
                Arrays.asList(8, 4, 6, 5);
        // Can't do it: numbers.add(3);

        // Map
        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 30);
        ages.put("Mary", 25);
        System.out.println( ages.get("John") );


        final double price = 200;
        final double discount = 10;
        final double finalPrice = price - discount;
        System.out.println("The final price is " + finalPrice);
        // Can't do it: finalPrice = price;

        printHello("John", 30);
        printHello("Mary", 25);

        final double p = MathUtil.power(2, 10);
        System.out.println("2^10 = " + p);
    }

    /** prints hello */
    static void printHello(String name, int age) {

        System.out.println("hello " + name + ", you are " + age);
    }
}
