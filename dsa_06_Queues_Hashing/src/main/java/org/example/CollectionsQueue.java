package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue {
    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<>();
        for (int i = 0; i < 5; i++) {
            mq.enqueue(i);
        }
        for (int i = 0; i <5; i++) {
            System.out.println(mq.dequeue());
        }

        Queue<Integer> cq = new LinkedList<>();
        cq.add(1);
        cq.add(2);
        System.out.println(cq.remove());
        System.out.println(cq.remove());












    }

}
