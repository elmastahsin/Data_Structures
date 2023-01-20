package org.example;

public class SearchingAlgorithms {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(binarySearch(0, nums.length, 6, nums));
    }

    public static int binarySearch(int left, int right, int value, int[] nums) {
        while (left >= right) {
            int middle = (left + right) / 2;
            if (value > nums[middle]) {
                binarySearch(middle + 1, right, value, nums);
            } else if (value < nums[middle]) {
                binarySearch(left, middle - 1, value, nums);
            } else if (value==nums[middle]){
                return middle;
            }
        }
        return -1;
    }
}
