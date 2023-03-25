package org.example.queueQuestion;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseKthElementInQueue {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        for (int i = 1; i < 6; i++) {
            queue.enqueue(i);
        }
        System.out.println("Initial queue :");
        queue.printQueue();
        System.out.println();
        System.out.println("After reverse: ");
        reverseFirstK(queue, 3).printQueue();
    }

    static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k) {
        //create a stack
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }

        for (int i = 0; i < queue.size-k; i++) {
            queue.enqueue(queue.dequeue());
        }


        return queue;
    }
}
