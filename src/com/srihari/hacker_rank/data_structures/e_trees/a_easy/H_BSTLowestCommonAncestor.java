package com.srihari.hacker_rank.data_structures.e_trees.a_easy;

/**
 * https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
 */
public class H_BSTLowestCommonAncestor {
    private static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node lca(Node root, int v1, int v2) {
        if(root == null){
            return null;
        }

        if(Math.min(v1, v2) <= root.data && Math.max(v1, v2) >= root.data)
            return root;
        if(v1 < root.data){
            return lca(root.left, v1, v2);
        }
        if(v1 > root.data){
            return lca(root.right, v1, v2);
        }

        return root;
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
        root = insert(root, 8);
        root = insert(root, 4);
        root = insert(root, 9);
        root = insert(root, 1);
        root = insert(root, 2);
        root = insert(root, 3);
        root = insert(root, 6);
        root = insert(root, 5);

        Node ans = lca(root, 1, 2);
        System.out.println(ans.data);
    }
}
