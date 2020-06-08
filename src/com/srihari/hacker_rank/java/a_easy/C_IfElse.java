package com.srihari.hacker_rank.java.a_easy;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-if-else/problem
 */
public class C_IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if(N%2 == 1 || (N%2 == 0 && N>=6 && N<=20)){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }
}
