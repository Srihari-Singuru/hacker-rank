package com.srihari.hacker_rank.data_structures.a_arrays.b_medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/sparse-arrays/problem
 */
public class A_SparseArrays {
    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];
        Map<String, Integer> stringsMap = new HashMap<>();
        for(String str : strings){
            stringsMap.put(str, stringsMap.getOrDefault(str, 0) + 1);
        }
        for(int i=0; i<queries.length; i++){
            result[i] = stringsMap.getOrDefault(queries[i], 0);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"ab", "ab", "abc"};
        String[] queries = {"ab", "abc", "bc"};
        int[] res = matchingStrings(strings, queries);
        System.out.println(Arrays.toString(res));
    }
}
