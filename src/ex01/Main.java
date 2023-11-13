package ex01;

/**
 * What will be the output of the following code?
 */
public class Main {
    public static void main(String[] args) {
        sayHello();
    }

    public static String sayHello() {
        throw new NullPointerException();
    }
}