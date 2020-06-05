package com.srihari.hacker_rank.a_warmup;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class G_MinMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        /*Arrays.sort(arr);   // O(nlogn)
        int sum = Arrays.stream(arr).sum();

        System.out.println((sum-arr[arr.length-1])+" "+(sum-arr[0]));*/

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long sum = 0;

        for (long value : arr) {    // O(n)
            min = Math.min(value, min);
            max = Math.max(value, max);
            sum += value;
        }

        System.out.println((sum-max)+" "+(sum-min));
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        miniMaxSum(arr);
    }
}
