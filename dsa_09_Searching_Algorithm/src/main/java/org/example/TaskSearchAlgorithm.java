package org.example;

import javax.sound.sampled.Line;
import javax.swing.text.html.StyleSheet;

public class TaskSearchAlgorithm {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            array[i] = i;
        }
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        System.out.println(BinarySearch.binarySearchIterative(array, 3333));
        endTime = System.currentTimeMillis();
        System.out.println("Binary Search Time : " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        System.out.println(BinarySearch.binarySearchRecursive(array, 3333, 0, 1000000));
        endTime = System.currentTimeMillis();
        System.out.println("Binary Search Recursive Time : " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        System.out.println(LinearSearch.linearSearch(array, 3333));
        endTime = System.currentTimeMillis();
        System.out.println("Linear Search Time : " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println(TernarySearch.ternarySearch(array, 3333));
        endTime = System.currentTimeMillis();
        System.out.println("Ternary Search Time : " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        System.out.println(TernarySearch.ternarySearchRecursive(array, 3333, 0, 1000000));
        endTime = System.currentTimeMillis();
        System.out.println("Ternary Search Recursive Time : " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println(JumpSearch.jumpSearch(array, 3333));
        endTime = System.currentTimeMillis();
        System.out.println("Jump Search Time : " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        System.out.println(ExponentialSearch.exponentialSearch(array, 3333));
        endTime = System.currentTimeMillis();
        System.out.println("Exponential Search Time : " + (endTime - startTime));


    }


}
