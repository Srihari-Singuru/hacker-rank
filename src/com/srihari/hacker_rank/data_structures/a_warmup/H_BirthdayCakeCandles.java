package com.srihari.hacker_rank.data_structures.a_warmup;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */
public class H_BirthdayCakeCandles {
    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int frequency = 0;
        int max = Integer.MIN_VALUE;
        for (int value : ar) {  // O(n)
            if(Math.max(max, value) > max){
                max = Math.max(max, value);
                frequency = 1;
            } else if(max == value){
                frequency++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        int[] ar = {3, 2, 1, 3};
        int result = birthdayCakeCandles(ar);
        System.out.println(result);
    }
}
