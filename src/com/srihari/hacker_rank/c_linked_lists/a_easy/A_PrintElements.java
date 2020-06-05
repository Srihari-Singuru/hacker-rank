package com.srihari.hacker_rank.c_linked_lists.a_easy;

/**
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem
 */
public class A_PrintElements {
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

    // Complete the printLinkedList function below.
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;    // do not want to disturb the head pointer
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertNode(16);
        llist.insertNode(3);

        printLinkedList(llist.head);
    }
}
