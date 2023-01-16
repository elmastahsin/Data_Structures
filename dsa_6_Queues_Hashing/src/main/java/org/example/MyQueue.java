package org.example;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    QueueNode<T> front;
    QueueNode<T> back;
    int size;

    boolean isEmpty() {
        return front == null;
    }

    T peek() {
        return (T) front.value;
    }

    void enqueue(T item) {
        QueueNode<T> node = new QueueNode<>(item);
        if (isEmpty()) {
            front = back = node;
        } else {
            back.next = node;
            back = node;
        }
        size++;
    }
    T dequeue(){
        QueueNode frontNode ;   
        if (isEmpty())throw new NoSuchElementException();
        // for one elemnt in queue
        if (front==back){
            frontNode = front;
            front = back =null;
        }// now I have more than one element
        else {
            frontNode = front;
            front = front.next;
        }
        size--;
        return (T)frontNode.value;
    }
    int size(){return size;}
}
