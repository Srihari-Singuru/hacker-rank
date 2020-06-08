package com.srihari.hacker_rank.data_structures.j_advanced.b_medium;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/find-maximum-index-product/problem
 */
public class A_MaxIndexProdict {
    static long solve(int[] arr) {
        Stack<Integer> leftIndexStack = new Stack<>();
        Stack<Integer> rightIndexStack = new Stack<>();

        int length = arr.length;
        int[] leftIndex = new int[length];
        int[] rightIndex = new int[length];

        leftIndex[0] = 0;
        leftIndexStack.push(0);
        for(int i = 1; i < length; i++){
            while(!leftIndexStack.isEmpty() && arr[i] >= arr[leftIndexStack.peek()]){
                leftIndexStack.pop();
            }
            if(leftIndexStack.isEmpty()){
                leftIndex[i] = 0;
            } else {
                leftIndex[i] = leftIndexStack.peek() + 1;   // 1 based index in description
            }

            leftIndexStack.push(i);
        }

        rightIndex[length-1] = 0;
        rightIndexStack.push(length-1);
        for(int i = length-2; i >= 0; i--){
            while(!rightIndexStack.isEmpty() && arr[i] >= arr[rightIndexStack.peek()]){
                rightIndexStack.pop();
            }
            if(rightIndexStack.isEmpty()){
                rightIndex[i] = 0;
            } else{
                rightIndex[i] = rightIndexStack.peek() + 1;
            }
            rightIndexStack.push(i);
        }


        long indexProduct=0;
        for(int i=0; i<length; i++){
            indexProduct = Math.max(indexProduct, (long)leftIndex[i] * rightIndex[i]);
        }
        return indexProduct;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 4, 5};
        long result = solve(arr);
        System.out.println(result);
    }
}
