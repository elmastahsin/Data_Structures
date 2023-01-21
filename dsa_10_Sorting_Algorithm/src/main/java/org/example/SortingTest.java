package org.example;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 4, 6, 1, 9, -1};
        System.out.println("BubbleSort:\t\t" + Arrays.toString(BubbleSort.bubbleSort(numbers)));
        System.out.println("SelectionSort:\t" + Arrays.toString(SelectionSort.selectionSort(numbers)));
        System.out.println("InsertionSort:\t" + Arrays.toString(InsertionSort.insertionSort(numbers)));
        JD01MergeSort.mergeSort(numbers);
        //JD1QuickSort.qSort(numbers, 0, numbers.length-1);
        System.out.println("MergeSort: " + Arrays.toString(numbers));

    }
}
