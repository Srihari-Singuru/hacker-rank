package com.srihari.hacker_rank.data_structures.b_linked_lists.a_easy;

/**
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem
 */
public class C_InsertAtHead {

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

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        node.next = llist;
        llist = node;

        return llist;
    }

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, 383);
        llist.head = llist_head;

        llist_head = insertNodeAtHead(llist.head, 484);
        llist.head = llist_head;

        llist_head = insertNodeAtHead(llist.head, 392);
        llist.head = llist_head;

        printSinglyLinkedList(llist.head, "\n");
    }
}