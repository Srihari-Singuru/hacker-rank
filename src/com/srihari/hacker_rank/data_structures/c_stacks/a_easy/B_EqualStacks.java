package com.srihari.hacker_rank.data_structures.c_stacks.a_easy;

import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/equal-stacks/problem
 */
public class B_EqualStacks {
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int h1Sum = IntStream.of(h1).sum();
        int h2Sum = IntStream.of(h2).sum();
        int h3Sum = IntStream.of(h3).sum();
        int i = 0;
        int j = 0;
        int k = 0;

        while (!(h1Sum == h2Sum && h2Sum == h3Sum)){
            if(h1Sum > h2Sum) {
                h1Sum = h1Sum - h1[i];
                i++;
            }

            if(h2Sum > h3Sum){
                h2Sum = h2Sum - h2[j];
                j++;
            }

            if(h3Sum > h1Sum){
                h3Sum = h3Sum - h3[k];
                k++;
            }
        }

        return h1Sum;
    }

    public static void main(String[] args) {
        int[] h1 = {3, 2, 1, 1, 1};
        int[] h2 = {4, 3, 2};
        int[] h3 = {1, 1, 4, 1};

        int result = equalStacks(h1, h2, h3);
        System.out.println(result);
    }
}
