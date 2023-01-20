package org.example.heapAssignment;

import org.example.MyHeap;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //      System.out.println("Enter numbers: ");
        int[] nums = {3, 2, 1, 5, 6, 4};

        System.out.println("Enter k: ");
        int k = input.nextInt();

        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
// create a heap
        MyHeap heap = new MyHeap(nums.length);
        for (int i = 0; i < nums.length; i++) {
            heap.insert(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            heap.remove();
        }


        return heap.peek();
    }
    public static int findKthLargest2(int[] nums, int k) {
// create a heap
       Queue<Integer> result = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            result.remove();
        }


        return result.peek();
    }
}
