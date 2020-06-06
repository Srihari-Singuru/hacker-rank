package com.srihari.hacker_rank.algorithms.a_warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/simple-array-sum/problem
 */

public class A_SimpleArraySum {
    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {4, 5, 6};
        int result = simpleArraySum(arr);
        System.out.println(result);
    }
}
