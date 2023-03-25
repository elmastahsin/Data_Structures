package org.example;

public class JumpSearch {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(jumpSearch(nums, 6));
    }
     public static int jumpSearch(int[] array, int data){
        int blockSize=(int)Math.sqrt(array.length);
        int start=0;
        int next=blockSize-1;
        while (start< array.length && array[next-1]<data){
            start=next;
            next+=blockSize;
            if (next> array.length) next= array.length;
        }
        for (int i = start; i <next ; i++) {
            if (array[i]==data) return i;
        }
        return -1;
    }
}
