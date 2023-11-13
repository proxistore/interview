package ex04;

import java.util.ArrayList;
import java.util.List;

/**
 * Complete the main method and write a method which would find the first person who's name is passed in parameter
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>() {{
            add(new Person("Johnny", "Walker"));
            add(new Person("William", "Lawson"));
        }};
    }
}

class Person {
    final String firstName;
    final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

