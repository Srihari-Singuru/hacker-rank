package com.srihari.hacker_rank.algorithms.a_warmup;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
public class B_CompareTheTriplets {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i))
                aliceScore++;
            else if (b.get(i) > a.get(i))
                bobScore++;
        }

        //return List.of(aliceScore, bobScore); // Java 9 onwards
        return Arrays.asList(aliceScore, bobScore);
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(5, 6, 7);
        List<Integer> b = List.of(3, 6, 10);

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result);
    }
}
