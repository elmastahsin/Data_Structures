package org.example;

public class MergeSort {


    public static void mergeSort(int[] array) {
        if (array.length < 2) return;
        int mid = array.length / 2;
        int[] left = new int[mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        int[] right = new int[array.length - mid];
        for (int i = mid; i < array.length; i++) {
            right[i-mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    public static void merge(int[] left, int[] right, int[] result) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }


}
