package com.srihari.daily_coding.a_easy;

import java.util.Arrays;

/**
 * This problem was asked by Uber.
 *
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
public class B_ProductArray {
    public static void main(String[] args) {
        int[] nums = {5, 3, 4, 2};
        int[] result = productizeNums(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] productizeNums(int[] nums) {
        int[] result = new int[nums.length];

        /*int[] temp1 = new int[nums.length];
        temp1[0] = 1;
        for(int i=1; i<nums.length; i++){  // prefix-sum algorithm
            temp1[i] = temp1[i-1] * nums[i-1];      // {1, 5, 15, 60}
        }

        int[] temp2 = new int[nums.length];
        temp2[nums.length - 1] = 1;
        for(int i=nums.length-2; i>=0; i--){    // prefix-sum algorithm from right to left
            temp2[i] = temp2[i+1] * nums[i+1];      // {24, 8, 2, 1}
        }

        for(int i=0; i<nums.length; i++){
            result[i] = temp1[i] * temp2[i];      // multiply above two temp values
        }

        return result;
        */

        // we can even simply like below
        result[nums.length-1] = 1;
        for(int i= nums.length-2; i>=0; i--){
            result[i] = result[i+1] * nums[i+1];
        }

        int left = 1;       // replicating prefix-sum algorithm at runtime
        for(int i=0; i<nums.length; i++){
            result[i] = result[i] * left;
            left = left * nums[i];
        }

        return result;
    }
}
