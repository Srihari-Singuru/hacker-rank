package com.srihari.hacker_rank.data_structures.c_stacks.c_hard;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/and-xor-or/problem
 *
 * Not completed yet
 */
public class B_AndxorOR {
    /* For each int i in the array A
    while stack is nonempty
        yield (i, top of stack)
        if i is less than the top of the stack, pop the stack
        otherwise break the while loop
    push i onto stack */

    static int andXorOr(int[] a) {
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(int item : a){
            while (!stack.isEmpty()){
                if(item < stack.peek()){
                    max = Math.max(max, calculate(item, stack.peek()));
                    stack.pop();
                } else{
                    break;
                }
            }
            stack.push(item);
        }
        return max;
    }

    static int calculate(int x, int y) {
        return ((x & y) ^ (x | y)) & (x ^ y);
    }

    public static void main(String[] args) {
        int[] a = {9, 6, 3, 5, 2};
        int result = andXorOr(a);
        System.out.println(result);
    }
}
