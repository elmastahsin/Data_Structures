package org.example;

public class QuickSort {
    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) return;// base condition termination
        int boundary = partition(array, start, end);
        quickSort(array, start, boundary - 1);
        quickSort(array, boundary + 1, end);
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot) swap(array, i, boundary++);
        }
        return boundary - 1;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
