package com.srihari.hacker_rank.data_structures.b_linked_lists.a_easy;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
 */
public class D_InsertAtPosition {
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
            System.out.println((node.data));

            node = node.next;

            if (node != null) {
                System.out.println(sep);
            }
        }
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(position == 0){
            node.next = head;
            head = node;
            return head;
        }

        SinglyLinkedListNode previous = head;
        for(int i=1; i<position; i++ ){
            previous = previous.next;
        }
        node.next = previous.next;
        previous.next = node;

        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertNode(16);
        llist.insertNode(13);
        llist.insertNode(7);

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, 1, 2);
        printSinglyLinkedList(llist_head, " ");
    }
}
