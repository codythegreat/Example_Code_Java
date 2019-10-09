package com.company;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {
    //exceptions come in a few flavors:
    // Java.lang.RunTimeException
    // Java.lang.Exception (from the compiler)

    // common exceptions
    // ArithmeticException - common with math/division by zero
    // ClassNotFoundException
    // IllegalArgumentException
    // IndexOutOfBoundsException
    // InputMismatchException
    // IOException

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        divideByZero(2);

        int age = -1;
        while (age <= 0) {
            System.out.println("type in your age : ");
            age = checkAgeInput();
        }
        System.out.println("You are " + age + " years old.");
        getAFile("test.txt");
    }
    public static void divideByZero(int dividend) {
        try {
            System.out.println(dividend/0);
        } catch (ArithmeticException e) {
            // there are a couple of ways you could handle this error:
            System.out.println("You can't do that");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            //e.printStackTrace();
        }
    }
    public static int checkAgeInput() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            // skip over the previous input for the next
            scanner.next();
            System.out.println("Please type a whole number");
            return 0;
        }
    }
    public static void getAFile(String fileName) {
        System.out.println(fileName);
    }
}
