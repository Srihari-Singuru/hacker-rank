package com.srihari.hacker_rank.data_structures.e_trees.b_medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://www.hackerrank.com/challenges/swap-nodes-algo/problem
 */
public class C_SwapNodesAlgo {
    static int[][] swapNodes(int[][] indexes, int[] queries) {
        int[][] result = new int[queries.length][];
        Node root = formTree(indexes);
        int height = height(root);
        for(int i=0; i<queries.length; i++){
            /*while(queries[i] <= height) {
                swap(root, queries[i]);
                queries[i] *= 2;
            }*/
            swap(root, queries[i], 1);
            List<Integer> inOrder = new ArrayList<>();
            inOrder(root, inOrder);
            result[i] = inOrder.stream().mapToInt(x -> x).toArray();
        }
        return result;
    }

    private static Node formTree(int[][] indexes){
        Node node = new Node(1);

        Node curr = node;
        Queue<Node> nodes = new LinkedList<>();
        nodes.offer(curr);

        for (int[] index : indexes) {
            curr = nodes.poll();

            int leftNode = index[0];
            int rightNode = index[1];

            if (curr != null) {
                curr.left = leftNode == -1 ? null : new Node(leftNode);
                curr.right = rightNode == -1 ? null : new Node(rightNode);

                //Now we are going to add the nodes for next iteration to create node

                if (curr.left != null && curr.left.data != -1)
                    nodes.offer(curr.left);
                if (curr.right != null && curr.right.data != -1)
                    nodes.offer(curr.right);
            }
        }

        return node;
    }

    private static int height(Node root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private static void swap(Node root, int k, int depth){
        if(root == null){
            return;
        }
        /*if(k == 1){
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        swap(root.left, k - 1);
        swap(root.right, k - 1);*/

        swap(root.left, k, depth+1);
        swap(root.right, k, depth+1);

        if(depth >= k && depth % k == 0){
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }

    private static void inOrder(Node root, List<Integer> inOrder){
        if(root == null){
            return;
        }
        inOrder(root.left, inOrder);
        inOrder.add(root.data);
        inOrder(root.right, inOrder);
    }

    static class Node{
        private final int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] indexes = { {	-1, 2	},
                {	3, 4	},
                {	5, 6	},
                {	7, -1	},
                {	8, -1	},
                {	9, 10	},
                {	11, 12	},
                {	-1, 13	},
                {	14, 15	},
                {	-1, -1	},
                {	-1, 16	},
                {	17, -1	},
                {	18, 19	},
                {	20, 21	},
                {	22, 23	},
                {	-1, -1	},
                {	24, 25	},
                {	26, -1	},
                {	27, 28	},
                {	29, 30	},
                {	31, -1	},
                {	32, 33	},
                {	34, 35	},
                {	36, 37	},
                {	38, 39	},
                {	-1, 40	},
                {	-1, 41	},
                {	-1, 42	},
                {	-1, -1	},
                {	43, 44	},
                {	-1, -1	},
                {	45, 46	},
                {	47, 48	},
                {	-1, -1	},
                {	-1, 49	},
                {	-1, 50	},
                {	51, 52	},
                {	-1, 53	},
                {	54, 55	},
                {	-1, 56	},
                {	57, -1	},
                {	-1, 58	},
                {	59, -1	},
                {	60, 61	},
                {	-1, 62	},
                {	-1, 63	},
                {	-1,	-1},
                {	-1, 64	},
                {	65, -1	},
                {	66, -1	},
                {	-1, 67	},
                {	-1, -1	},
                {	-1, 68	},
                {	-1, 69	},
                {	70, -1	},
                {	71, -1	},
                {	72, 73	},
                {	74, 75	},
                {	-1, -1	},
                {	76, -1	},
                {	77, -1	},
                {	-1, -1	},
                {	78, -1	},
                {	-1, -1	},
                {	79, 80	},
                {	81, 82	},
                {	-1, 83	},
                {	84, -1	},
                {	85, -1	},
                {	86, -1	},
                {	-1, 87	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, 88	},
                {	-1, -1	},
                {	89, 90	},
                {	-1, -1	},
                {	91, -1	},
                {	-1, 92	},
                {	93, -1	},
                {	94, 95	},
                {	-1, -1	},
                {	96, 97	},
                {	98, -1	},
                {	-1, 99	},
                {	100, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	},
                {	-1, -1	} };
        int queriesCount = 2;
        int[] queries = {8,
                6,
                2,
                3,
                5,
                7,
                7,
                5,
                7,
                1,
                5,
                6,
                2,
                8,
                4,
                6,
                8,
                12,
                10,
                6,
                12,
                11,
                12,
                8,
                1,
                7,
                9,
                3,
                8,
                7,
                2,
                7,
                8,
                3,
                8,
                9,
                7,
                9,
                9,
                8,
                11,
                10,
                4,
                12,
                4};

        int[][] result = swapNodes(indexes, queries);

        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
                System.out.println(result[resultRowItr][resultColumnItr]);

                if (resultColumnItr != result[resultRowItr].length - 1) {
                    System.out.println(" ");
                }
            }

            if (resultRowItr != result.length - 1) {
                System.out.println("\n");
            }
        }
    }
}
