package com.srihari.hacker_rank.data_structures.a_arrays.a_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/dynamic-array/problem
 */
public class B_DynamicArray {
    public static void main(String[] args) {
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 0, 5),
                Arrays.asList(1, 1, 7),
                Arrays.asList(1, 0, 3),
                Arrays.asList(2, 1, 0),
                Arrays.asList(2, 1, 1)
        );
        List<Integer> result = dynamicArray(2, queries);
        System.out.println(result);
    }

    private static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> seqList = new ArrayList<>();
        for(int i=0; i<n; i++)
            seqList.add(new ArrayList<>());
        int lastAnswer = 0;
        int seq = 0;

        for(List<Integer> query : queries){
            seq = (query.get(1) ^ lastAnswer) % n;
            if(query.get(0) == 1){
                seqList.get(seq).add(query.get(2));
            } else {
                lastAnswer = seqList.get(seq).get(query.get(2) % seqList.get(seq).size());
                result.add(lastAnswer);
            }
        }
        return result;
    }
}
