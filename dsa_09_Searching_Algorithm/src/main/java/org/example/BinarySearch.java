package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(binarSearchIterative(nums, 6));
        System.out.println(binarySearchRecursive(nums, 6));
    }

    public static int binarSearchIterative(int[] array, int data) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (data > array[middle]) {
                left = middle + 1;
            } else if (data < array[middle]) {
                right = middle - 1;
            } else if (data == array[middle]) {
                return middle;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] array, int data) {
        return binarySearchRecursive(array,data, 0,array.length-1);
    }

    public static int binarySearchRecursive(int[] array, int data, int left, int right) {
        if (left > right) return -1;
        int middle = (left + right) / 2;
        if (array[middle] == data) return middle;
        if (data < array[middle]) return binarySearchRecursive(array, data, left, middle - 1);
        else return binarySearchRecursive(array, data, middle + 1, right);

    }
}
