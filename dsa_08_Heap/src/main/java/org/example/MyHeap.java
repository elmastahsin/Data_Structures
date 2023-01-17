package org.example;

import java.util.NoSuchElementException;

public class MyHeap {
    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }

    public int peek(){
        if (size==0)throw new NoSuchElementException();
        return items[0];

    }



}
