package com.srihari.hacker_rank.data_structures.b_linked_lists.a_easy;

/**
 * https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
 */
public class E_DeleteNode {
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

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(head == null){
            return null;
        }
        if(position == 0){
            head = head.next;
            return head;
        }

        SinglyLinkedListNode current = head;
        for(int i=0; i<position-1; i++){
            current = current.next;
        }
        current.next = current.next.next;

        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertNode(20);
        llist.insertNode(6);
        llist.insertNode(2);
        llist.insertNode(19);
        llist.insertNode(7);
        llist.insertNode(4);


        SinglyLinkedListNode llist1 = deleteNode(llist.head, 3);

        printSinglyLinkedList(llist1, " ");
    }
}
