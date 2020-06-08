package com.srihari.hacker_rank.data_structures.b_linked_lists.a_easy;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem
 */
public class F_PrintReverse {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    static void reversePrint(SinglyLinkedListNode head) {
        Stack<Integer> stack = new Stack<>();
        SinglyLinkedListNode current = head;
        while(current != null){
            stack.push(current.data);
            current = current.next;
        }
        while(stack.size() > 0){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertNode(3);
        llist.insertNode(4);
        llist.insertNode(5);

        reversePrint(llist.head);
    }
}
