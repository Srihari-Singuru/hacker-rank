package com.srihari.hacker_rank.warmup;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 */
public class F_StairCase {
    // Complete the staircase function below.
    static void staircase(int n) {
        char[] val = String.format("%"+n+"s", " ").toCharArray();
        for(int i = n-1; i>=0; i--){
            val[i] = '#';
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        staircase(4);
    }
}
