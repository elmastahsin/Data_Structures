package org.example;

import java.security.PublicKey;
import java.util.NoSuchElementException;

public class MyStack<T> {
    public SNodes<T> bottom;
    public SNodes<T> top;
    int size;

    public boolean isEmpty() {
        return bottom == null;
    }

    public void push(T item) {
        SNodes<T> node = new SNodes<>(item);
        if (isEmpty()) {
            bottom = top = node;
        } else {
            top.next = node;
            top = node;
        }
        size++;
    }

    public T peek() {
        return (T) top.value;
    }

    public T pop() {
        SNodes peekNode;
        if (isEmpty()) throw new NoSuchElementException();

        // stack has 1 element
        if (top == bottom) {

            peekNode = top;
            top = bottom = null;

        }else { // more than one element
        peekNode=top;
        SNodes prev =bottom;
        while( prev.next!=top){
            prev=prev.next;
        }
        prev.next=null;
        top=prev;
        }
        size--;
        return (T) peekNode.value;

    }
}
