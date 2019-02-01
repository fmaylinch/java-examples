package tech.bts.javaexamples.smells;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeSmellsPractice {

    public static void main(String[] args) {

        final List<Integer> list = buildSomething(1, 7, 2);
        System.out.println(list);
        System.out.println();

        System.out.println( buildGreeting("Susan", "Ms", true, false, true) );
        System.out.println();

        final Client client = new Client();
        client.setName("Peter");
        client.setCountry("England");
        displayClientData(client);
        System.out.println();

        readAndDisplayClient();
    }

    /** Builds a list of numbers */
    public static List<Integer> buildSomething(int a, int b, int c) {

        final List<Integer> r = new ArrayList<>();

        for (int i = a; i <= b; i += c) {
            r.add(i);
        }

        return r;
    }

    public static String buildGreeting(String name, String title, boolean formal, boolean exclamation, boolean askQuestion) {

        final StringBuilder result = new StringBuilder();

        result.append(formal ? "Hello " : "Hi ");

        if (title != null) {
            result.append(title).append(" ");
        }

        result.append(name);

        result.append(exclamation ? "!" : ".");

        if (askQuestion) {
            if (formal) {
                result.append(" What can I do for you?");
            } else {
                result.append(" What's up?");
            }
        }

        return result.toString();
    }

    public static void displayClientData(Client client) {

        System.out.println("--- Client data ---");

        String name = client.getName();
        if (name == null || name.isEmpty()) {
            name = "(unknown)";
        }
        System.out.println("Name: " + name);

        String surname = client.getSurname();
        if (surname == null || surname.isEmpty()) {
            surname = "(unknown)";
        }
        System.out.println("Surname: " + surname);

        String email = client.getEmail();
        if (email == null || email.isEmpty()) {
            email = "(unknown)";
        }
        System.out.println("Email: " + email);

        String country = client.getCountry();
        if (country == null || country.isEmpty()) {
            country = "(unknown)";
        }
        System.out.println("Email: " + country);
    }

    public static void readAndDisplayClient() {

        final Scanner scanner = new Scanner(System.in);
        final Client client = new Client();

        System.out.println("Please enter client data -->");
        System.out.print("Name: ");
        client.setName( scanner.nextLine() );
        System.out.print("Surname: ");
        client.setSurname( scanner.nextLine() );
        System.out.print("Email: ");
        client.setEmail( scanner.nextLine() );
        System.out.print("Country: ");
        client.setCountry( scanner.nextLine() );

        System.out.println("\nData entered -->");
        System.out.println("Name: " + client.getName());
        System.out.println("Surname: " + client.getSurname());
        System.out.println("Email: " + client.getEmail());
        System.out.println("Country: " + client.getCountry());
    }
}
