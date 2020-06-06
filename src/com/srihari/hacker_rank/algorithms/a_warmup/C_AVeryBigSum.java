package com.srihari.hacker_rank.algorithms.a_warmup;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class C_AVeryBigSum {
    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        long result = aVeryBigSum(ar);
        System.out.println(result);
    }
}
