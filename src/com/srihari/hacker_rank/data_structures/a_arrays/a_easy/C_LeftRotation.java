package com.srihari.hacker_rank.data_structures.a_arrays.a_easy;

/**
 * https://www.hackerrank.com/challenges/array-left-rotation/problem
 */
public class C_LeftRotation {
    private static void leftRotate(int[] a, int d){
        int position = d % a.length;
        for(int i : a){
            if(position >= a.length){
                position = 0;
            }
            System.out.print(a[position++]+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        leftRotate(array, 4);
    }
}
