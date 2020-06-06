package com.srihari.hacker_rank.data_structures.a_arrays.a_easy;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/arrays-ds/problem
 */
public class A_ArraysDS {
    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        int[] reverse = new int[a.length];
        for (int i=a.length-1, j=0; i >= 0; i--, j++) {
            reverse[j] = a[i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2};
        int[] res = reverseArray(arr);
        System.out.println(Arrays.toString(res));
    }
}
