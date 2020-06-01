package com.srihari.hackerrank.problem_solving.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 *
 */
public class D_DiagonalDifference {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int left = 0;
        int right = 0;
        for(int i=0,j=arr.size()-1; i<arr.size() && j>=0; i++,j--){
            left += arr.get(i).get(i);
            right += arr.get(i).get(j);
        }
        return Math.abs(left - right);
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );
        int result = diagonalDifference(arr);
        System.out.println(result);
    }
}
