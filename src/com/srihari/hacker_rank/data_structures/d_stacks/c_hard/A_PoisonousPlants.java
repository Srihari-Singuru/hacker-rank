package com.srihari.hacker_rank.data_structures.d_stacks.c_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/poisonous-plants/problem
 *
 *
 * Couldn't find the proper answer yet
 *
 *
 */
public class A_PoisonousPlants {
    // Complete the poisonousPlants function below.
    static int poisonousPlants(int[] p) {
        /*int day = 0;
        int interimDay = 0;
        int pivot = p[0];
        int temp = Integer.MAX_VALUE;
        for(int i=1; i<p.length; i++){
            if(p[i] > pivot && p[i] < temp){
                temp = p[i];
                interimDay++;
                day = Math.max(day, interimDay);
            } else if(p[i] > temp){
                temp = p[i];
            } else if(p[i] < pivot){
                pivot = p[i];
                temp = Integer.MAX_VALUE;
                interimDay = 0;
            }
        }

        return day;*/

        //List<Integer> plants = IntStream.of(p).boxed().collect(Collectors.toList());
        List<Integer> plants = new ArrayList<>();
        for(int i : p){
            plants.add(i);
        }

        int days = 0;
        while(true) {
            Stack<Integer> stack = new Stack<>();
            stack.push(plants.get(0));
            for (int i=1; i<plants.size(); i++) {
                if(plants.get(i) <= plants.get(i-1)){
                    stack.push(plants.get(i));
                }
            }
            if(plants.size() != stack.size()){
                days++;
            } else{
                break;
            }
            plants = stack;
        }

        return days;
    }

    public static void main(String[] args) {
        //int[] p = {20, 5, 6, 15, 2, 2, 17, 2, 11, 5, 14, 5, 10, 9, 19, 12, 5};    // 4
        //int[] p = {6, 5, 8, 4, 7, 10, 9};
        //int[] p = {5, 4, 6, 1, 3, 2};
        int[] p = {3, 1, 10, 7, 3, 5, 6, 6};
        //int[] p = {5, 5, 5, 5, 5};  // 0
        int result = poisonousPlants(p);
        System.out.println(result);
    }
}
