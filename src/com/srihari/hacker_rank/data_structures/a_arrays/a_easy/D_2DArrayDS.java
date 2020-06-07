package com.srihari.hacker_rank.data_structures.a_arrays.a_easy;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem
 */
public class D_2DArrayDS {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-2; i++){
            for(int j=0; j<arr[i].length-2; j++){
                max = Math.max(max, arr[i][j]+arr[i][j+1]+arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int result = hourglassSum(arr);
        System.out.println(result);
    }
}
