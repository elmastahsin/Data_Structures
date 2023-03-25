package org.example;

public class ExponentialSearch {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(exponentialSearch(nums, 3));
    }
    public static int exponentialSearch(int []array,int data){
        int bound =1;
        while (bound<array.length&& array[bound]<data) bound*=2;

        int left = bound/2;
        int right = Math.min(bound,array.length);
        return BinarySearch.binarySearchRecursive(array,data,left,right);
    }
}
