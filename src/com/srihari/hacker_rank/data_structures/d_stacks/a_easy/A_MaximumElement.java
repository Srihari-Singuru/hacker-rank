package com.srihari.hacker_rank.data_structures.d_stacks.a_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/maximum-element/problem
 */
public class A_MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfQueries = sc.nextInt();
        Stack<Integer> maxStack = new Stack<>();
        Stack<Integer> elementStack = new Stack<>();

        while (numberOfQueries > 0) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1 : {
                    int value = sc.nextInt();
                    elementStack.push(value);
                    if(maxStack.isEmpty() || value >= maxStack.peek()){
                        maxStack.push(value);
                    }
                    break;
                }
                case 2 : {
                    if (!elementStack.isEmpty()) {
                        int elem = elementStack.pop();
                        if(!maxStack.isEmpty() && elem == maxStack.peek()){
                            maxStack.pop();
                        }
                    }
                    break;
                }
                case 3 : {
                    if(!maxStack.isEmpty()){
                        System.out.println(maxStack.peek());
                    }
                    break;
                }
            }
            numberOfQueries--;
        }
        sc.close();
    }
}
