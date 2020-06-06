package com.srihari.daily_coding.a_easy;

import java.util.HashSet;
import java.util.Set;

/**
 * This problem was recently asked by Google.
 *
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 */
public class A_TwoSum {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int k = 17;

        boolean isPresent = twoSum(arr, k);
        System.out.println(isPresent);
    }

    private static boolean twoSum(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for(int elem : arr){
            if(set.contains(k - elem)){
                return true;
            }
            set.add(elem);
        }
        return false;
    }
}
