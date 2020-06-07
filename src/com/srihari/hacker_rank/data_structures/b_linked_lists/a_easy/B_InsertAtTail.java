package com.srihari.hacker_rank.data_structures.b_linked_lists.a_easy;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
 */
public class B_InsertAtTail {
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

        public SinglyLinkedList() {
            this.head = null;
        }


    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.println(node.data);

            node = node.next;

            if (node != null) {
                System.out.println(sep);
            }
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(head == null){
            return node;
        }

        SinglyLinkedListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;

        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, 141);
        llist.head = llist_head;

        llist_head = insertNodeAtTail(llist.head, 302);
        llist.head = llist_head;

        llist_head = insertNodeAtTail(llist.head, 164);
        llist.head = llist_head;

        llist_head = insertNodeAtTail(llist.head, 530);
        llist.head = llist_head;

        printSinglyLinkedList(llist.head, "\n");
    }
}
