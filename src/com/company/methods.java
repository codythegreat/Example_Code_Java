package com.company;

import java.util.Scanner;

public class methods {
    // you can use class variables anywhere, but they can be overridden in a method...
    static double pi = 3.14159;
    static Scanner scanner = new Scanner(System.in);

    // main method is the entry point of a java app. it is always defined with "public static void main(String[] args)
    public static void main(String[] args) {
        System.out.println("main is the entry point. Run other methods here");
        printPi(pi);
        System.out.println(pi);
        String caps = "MY KEYBOARD SEEMS BROKEN";
        method2();
        System.out.println(stopYelling(caps)); // note that we are passing the VALUE of caps and not the variable
        // notice that this does not change the main caps variable.
        System.out.println(caps);
        System.out.println(generateRandomNumber());
        randomGuessingGame();
    }
    public static void printPi(double pi) {
        // since we are working with a local value of pi this will only effect the local pi variable
        pi++;
        System.out.println(pi);
    }
    public static void method2() {
        System.out.println("this is a method with no return value.");
    }
    public static String stopYelling(String input) {
        return input.toLowerCase();
    }
    public static byte generateRandomNumber() {
        // use math.ceil so that we don't get a zero value. Values are 1-5
        return (byte)Math.ceil(Math.random()*5);
    }
    public static void randomGuessingGame() {
        System.out.print("Type in a guess (1-5) : ");
        int guess = scanner.nextByte();
        int random = generateRandomNumber();
        if (guess == random) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Wow what a bad guess.");
        }
        System.out.println("The number was " + random);
    }
}
