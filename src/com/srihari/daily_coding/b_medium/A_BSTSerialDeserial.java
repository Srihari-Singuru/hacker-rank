package com.srihari.daily_coding.b_medium;

import org.w3c.dom.Node;

import java.util.StringTokenizer;

/**
 * This problem was asked by Google.
 *
 * Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree
 *
 * node = Node('root', Node('left', Node('left.left')), Node('right'))
 * assert deserialize(serialize(node)).left.left.val == 'left.left'
 */
public class A_BSTSerialDeserial {
    private static class Node{
        private final int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.right = new Node(40);
        root.right.left = new Node(50);
        root.right.right = new Node(60);

        String serialized = serialize(root);
        Node result = deSerialize(serialized);

        if(
            result.data == root.data
            && result.left.data == root.left.data
            && result.right.data == root.right.data
            && result.left.right.data == root.left.right.data
            && result.right.left.data == root.right.left.data
            && result.right.right.data == root.right.right.data
        ){
            System.out.println("Success");
        } else{
            System.out.println("Failed");
        }
    }

    private static Node deSerialize(String serialized) {
        if(serialized == null || serialized.isEmpty()){
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(serialized, ", ");
        return deSerialize(stringTokenizer);
    }
    private static Node deSerialize(StringTokenizer stringTokenizer) {
        if(!stringTokenizer.hasMoreElements()){
            return null;
        }
        String value = stringTokenizer.nextToken();
        if(value.equalsIgnoreCase("-1")){
            return null;
        }

        Node node = new Node(Integer.parseInt(value));
        node.left = deSerialize(stringTokenizer);
        node.right = deSerialize(stringTokenizer);

        return node;
    }

    private static String serialize(Node root){
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }
    private static void serialize(Node root, StringBuilder sb) {
        if(root == null){
            sb.append(-1).append(", ");
            return;
        }

        sb.append(root.data).append(", ");
        serialize(root.left, sb);
        serialize(root.right, sb);
    }
}
