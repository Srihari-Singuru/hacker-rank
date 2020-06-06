package com.srihari.hacker_rank.data_structures.e_trees.b_medium;

/**
 * https://www.hackerrank.com/challenges/is-binary-search-tree/problem
 */
public class A_ValidBinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;
    }

    static boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkBST(Node root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.data <= min || root.data >= max){
            return false;
        }
        return checkBST(root.left, min, root.data) && checkBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        checkBST(null); // we can pass a tree here
    }
}
