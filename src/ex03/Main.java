package ex03;

import java.util.ArrayList;
import java.util.List;

/**
 * Complete the main method in order to get the list of people who have a first name that starts with the letter "J”
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
