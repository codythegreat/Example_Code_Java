package com.company;

import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // PRIMITIVE TYPES:
        // byte 1 +-128
        // short 2 +- 32k
        // int 4 +- 2b
        // long 8
        // float 4
        // double 8
        // char 2 ABC
        // boolean 1 t/f
	    byte age = 30;
	    long viewsCount = 3_123_456_789L;
	    float price = 10.99F;
	    char letter = 'A';
	    boolean isEligible = true;

	    // REFERENCE TYPES:
        // you must allocate memory for these
        Date now = new Date();

        System.out.println(now);
        System.out.println(age);

        // variables are independent of each other, refs are not
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        Point point1 = new Point(x = 1, y = 1);
        Point point2 = point1;
        // we are holding the address here
        point1.x = 2;
        System.out.println(point2);

        // old way to write strings
        String message = new String("Hello World");
        // new way to write strings
        String message2 = "Hello World" + "!";
        System.out.println(message2 + " " + message);
        System.out.println(message.endsWith("d"));
        System.out.println(message.length());
        System.out.println(message.indexOf("o"));
        System.out.println(message.replace("o", "0"));
        // Strings are immutable, so we'll need to reasign if we want to keep changes
        System.out.println(message);
        System.out.println(message.toLowerCase());
        String spacey = "  what ";
        System.out.println(spacey.trim().toUpperCase());

        // escape characters in java:
        message = "Hello \"Cody\"";
        System.out.println(message);

        String directory = "c:\\Windows\\..";
        System.out.println(directory);

        String newLine = "first line\nsecond line\nand third line";
        System.out.println(newLine);

        // arrays

        int[] numbers = new int[5];

        // or easier/newer way:
        int[] numbersEasy = {2, 3, 4, 5};

        numbers[0] = 1;
        numbers[1] = 45;

        //notice the ways to print an array or array item
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[1]);
        System.out.println(numbersEasy[3]);
        // you can sort and then print array numbers in order
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        // multidimensional arrays

        int[][] numbersMultDim = new int[2][3];
        numbersMultDim[0][0] = 1;
        System.out.println(Arrays.deepToString(numbersMultDim));

        // or we can declare it like this:
        int[][] numbersMultiDim = {{1,2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbersMultiDim));

        // constants
        // by typing "final" Java will not let us reassign a value to pi
        final float PI = 3.14F;
        // we use all caps when naming const

        // math expressions

        int result = 10+2;
        System.out.println(result);
        result = 10/3;
        System.out.println(result);
        // note that this is a whole number. to fix this...
        double resultDub = (double)10/(double)3;
        System.out.println(resultDub);

        // increment up and down
        int numb = 1;
        numb++;
        System.out.println(numb);
        // you can prefix or postfix these operators (x++ or ++x)
        // note that when using this during an assignment you'll get different results
        int numb2 = numb++; //numb increments, but numb2 doesn't
        int numb3 = ++numb2; // both increment for equal results

        numb = numb + 2;
        numb += 2;
        // these two assignments are identical

        // Casting:
        short two = 2;
        int three = 1 + two;
        System.out.println(three);
        // here we see that casting allows conversion of byte>short>int
        double dubX = 1.1;
        double dubY = 2+dubX;
        System.out.println(dubY);
        // here 2 is automatically converted to a double.
        // you can also cast into an int
        int dubZ = (int)dubX + 2;
        System.out.println(dubZ);

        // note that if you want to convert a string to an int/float:
        String strX = "1";
        int intX = Integer.parseInt(strX);
        System.out.println(intX);
        // note that you can also use Double.parseDouble

        // Math class
        int roundedX = (int) Math.round(1.1);
        System.out.println(roundedX);
        int ceilX = (int) Math.ceil(1.6);
        System.out.println(ceilX);
        int maxNumb = Math.max(3, 4);
        System.out.println(maxNumb);
        // we can explicitly cast to an into for random numbers:
        int randNumb = (int) Math.round(Math.random() * 100);
        System.out.println(randNumb);

        // Formatting numbers
        // create a new NumberFormat instance to print out a number to currency format
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(1234567.891));
        NumberFormat percentage = NumberFormat.getPercentInstance();
        System.out.println(percentage.format(.69));
        System.out.println(NumberFormat.getCurrencyInstance().format(450000));

        // Reading Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age? : ");
        byte ageInput = scanner.nextByte();
        System.out.println("You are " + ageInput);
        System.out.print("What is your name? : ");
        String name = scanner.next().trim();
        System.out.println("You are " + name);
    }
}
