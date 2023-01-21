package org.example;

public class TernarySearch {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(ternarySearch(nums, 6));
        System.out.println(ternarySearch(nums, 6));
    }

    public static int ternarySearch(int[] array, int data) {
        int left = 0;
        int right = array.length;
        int partitionSize = (left + right) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;
        while (left <= right) {
            if (array[mid1] == data) return mid1;
            if (array[mid1] == data) return mid2;
            if (data < array[mid1]) right = mid1 - 1;
            else if (data > mid2) left = mid2 + 1;
            else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }
        return -1;
    }

    public static int ternarySearchRecursive(int[] array, int data, int left, int right) {
        if (left > right) return -1;
        int partitionSize = (left + right) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;

        if (array[mid1] == data) return mid1;
        if (array[mid1] == data) return mid2;
        if (data < array[mid1]) return ternarySearchRecursive(array, data, left, mid1 - 1);
        else if (data > mid2) return ternarySearchRecursive(array, data, mid2 + 1, right);
        else return ternarySearchRecursive(array, data, mid1 + 1, mid2 - 1);

    }
}
