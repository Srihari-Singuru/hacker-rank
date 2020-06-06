package com.srihari.hacker_rank.data_structures.e_trees.a_easy;

/**
 * https://www.hackerrank.com/challenges/tree-top-view/problem
 */
public class F_BinaryTreeLevelOrder {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void levelOrder(Node root) {
        for(int i=0; i<=height(root); i++){
            printNodesAtDistance(root, i);
        }
    }

    private static int height(Node root){
        if(root == null){
            return -1;
        }
        if(root.left == null && root.right == null){
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    private static void printNodesAtDistance(Node root, int depth){
        if(root == null){
            return;
        }
        if(depth == 0){
            System.out.print(root.data+" ");
            return;
        }

        printNodesAtDistance(root.left, depth - 1);
        printNodesAtDistance(root.right, depth - 1);
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 1);
        insert(root, 2);
        insert(root, 3);
        insert(root, 4);
        insert(root, 5);
        insert(root, 6);

        levelOrder(root);
    }
}
