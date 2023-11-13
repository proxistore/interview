package ex02;

import java.io.IOException;

/**
 * What will be printed?
 */
public class Main {
    public static void main(String[] args) {
        sayHello();
    }

    public static String sayHello() {
        throw new IOException();
    }
}