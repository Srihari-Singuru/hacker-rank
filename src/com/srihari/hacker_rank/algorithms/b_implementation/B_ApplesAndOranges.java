package com.srihari.hacker_rank.algorithms.b_implementation;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 */
public class B_ApplesAndOranges {
    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        long appleCount = Arrays.stream(apples)
                                .map(apple -> apple + a)
                                .filter(apple -> apple >= s && apple <= t)
                                .count();
        long orangeCount = Arrays.stream(oranges)
                                 .map(orange -> orange + b)
                                 .filter(orange -> orange >= s && orange <= t)
                                 .count();

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int m = 3;
        int n = 2;
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
