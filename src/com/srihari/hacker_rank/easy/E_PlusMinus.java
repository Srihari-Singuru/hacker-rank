package com.srihari.hacker_rank.easy;

/**
 *
 * https://www.hackerrank.com/challenges/plus-minus/problem
 *
 */
public class E_PlusMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float plus = 0f;
        float zero = 0f;
        float minus = 0f;
        for (int value : arr) {
            if (value > 0) {
                plus++;
            } else if (value < 0) {
                minus++;
            } else {
                zero++;
            }
        }
        System.out.println(plus/arr.length);
        System.out.println(minus/arr.length);
        System.out.println(zero/arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }
}
