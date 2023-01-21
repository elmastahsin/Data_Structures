package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(binarSearchIterative( nums,6));
    }
    public static int binarSearchIterative(int []array,int data){
        int left=0;
        int right=array.length-1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (data > array[middle]) {
               left=middle+1;
            } else if (data < array[middle]) {
                right=middle-1;
            } else if (data==array[middle]){
                return middle;
            }
        }
        return -1;
    }
}
