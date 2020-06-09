package com.srihari.hacker_rank.data_structures.b_linked_lists.a_easy;

/**
 * https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
 */
public class H_CompareLists {
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

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1 != null || head2 != null){
            if(head1 == null || head2 == null || (head1.data != head2.data)){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        SinglyLinkedList llist1 = new SinglyLinkedList();
        llist1.insertNode(1);
        llist1.insertNode(2);
        llist1.insertNode(3);

        SinglyLinkedList llist2 = new SinglyLinkedList();
        llist2.insertNode(1);
        llist2.insertNode(2);
        llist2.insertNode(3);

        boolean result = compareLists(llist1.head, llist2.head);

        System.out.println(result ? 1 : 0);
    }
}
