package com.srihari.hacker_rank.data_structures.e_trees.a_easy;

import org.w3c.dom.Node;

import java.util.Map;
import java.util.TreeMap;

/**
 * https://www.hackerrank.com/challenges/tree-top-view/problem
 */
public class E_BinaryTreeTopView {
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

    static class Pair{
        Node node;
        int height;

        public Pair(Node node, int height) {
            this.node = node;
            this.height = height;
        }
    }
    public static void topView(Node root) {
        Map<Integer, Pair> map = new TreeMap<>();
        topView(root, 0, 0, map);

        map.values().stream()
                .map(pair -> pair.node.data+" ")
                .forEach(System.out::print);
    }
    public static void topView(Node root, int hDist, int height, Map<Integer, Pair> map) {
        if(root == null){
            return;
        }
        if(map.containsKey(hDist)){
            if(height < map.get(hDist).height){
                map.replace(hDist, new Pair(root, height));
            }
        } else{
            map.put(hDist, new Pair(root, height));
        }

        topView(root.left, hDist-1, height+1, map);
        topView(root.right, hDist+1, height+1, map);
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
        root = insert(root, 37);
        int[] dump = {23, 108, 59, 86, 64, 94, 14, 105, 17, 111, 65, 55, 31, 79, 97, 78, 25, 50, 22, 66, 46, 104, 98, 81, 90, 68, 40, 103, 77, 74, 18, 69, 82, 41, 4, 48, 83, 67,
                      6, 2, 95, 54, 100, 99, 84, 34, 88, 27, 72, 32, 62, 9, 56, 109, 115, 33, 15, 91, 29, 85, 114, 112, 20, 26, 30, 93, 96, 87, 42, 38, 60, 7, 73, 35, 12, 10, 57,
                      80, 13, 52, 44, 16, 70, 8, 39, 107, 106, 63, 24, 92, 45, 75, 116, 5, 61, 49, 101, 71, 11, 53, 43, 102, 110, 1, 58, 36, 28, 76, 47, 113, 21, 89, 51, 19, 3};

        for(int i : dump)
            insert(root, i);

        topView(root);
    }
}
