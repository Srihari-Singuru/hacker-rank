package com.srihari.hacker_rank.b_arrays.c_hard;

/**
 * https://www.hackerrank.com/challenges/crush/problem
 */
public class A_ArrayManipulation {
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        // O(n^2)
        /*int[] arr = new int[n];
        long max = Long.MIN_VALUE;
        for(int[] query : queries){
            for(int i=query[0]-1; i<query[1]; i++){
                max = Math.max(max, arr[i] += query[2]);
            }
        }
        return max;*/

        // O(n)
        long[] arr = new long[n+1];   // extra space for prefix-sum algorithm
        // problem statement says, index starts at 1, hence adding -1
        for (int[] query : queries) {
            arr[query[0] - 1] += query[2];        // add the value for the first index
            arr[query[1]] -= query[2];        // delete the value for the (second + 1) index (so that we do not need for loop)

            // explanation
            /*
             {0, 0, 0, 0, 0}
             {100, -100, 0, 0, 0}
             {100, 0, 0, 0, -100}
             {100, 0, 100, -100, -100}
             then apply prefix sum algorithm
            */
        }
        long max = arr[0];
        // prefix-sum algorithm
        for(int i=1; i<arr.length; i++){
            max = Math.max(arr[i]+=arr[i-1], max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] queries = {
                {2, 6, 8},
                {3, 5, 7},
                {1, 8, 1},
                {5, 9, 15}
        };
        long result = arrayManipulation(10, queries);
        System.out.println(result);
    }
}
