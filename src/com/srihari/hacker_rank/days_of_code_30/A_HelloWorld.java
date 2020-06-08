package com.srihari.hacker_rank.days_of_code_30;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/domains/tutorials/30-days-of-code
 */
public class A_HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.
        String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");

        System.out.println(inputString);
    }
}
