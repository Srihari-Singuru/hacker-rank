package com.srihari.hacker_rank.data_structures.d_queues.b_medium;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
 */
public class A_QueueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElem = scanner.nextInt();
        int query;

        for(int i=0; i<noOfElem; i++){
            query = scanner.nextInt();

            switch (query){
                case 1: {
                    Queue.enQueue(scanner.nextInt());
                    break;
                }
                case 2: {
                    Queue.deQueue();
                    break;
                }
                case 3: {
                    Queue.printElement();
                    break;
                }
            }
        }

        scanner.close();
    }

    private static class Queue {
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();

        public static void enQueue(int nextInt) {
            stack1.push(nextInt);
        }

        public static void deQueue() {
            fillStack2WithStack1();

            if (!stack2.isEmpty()){
                stack2.pop();
            }
        }

        public static void printElement() {
            fillStack2WithStack1();

            if (!stack2.isEmpty()) {
                System.out.println(stack2.peek());
            }
        }

        private static void fillStack2WithStack1() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
    }
}