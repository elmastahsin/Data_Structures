package session_8;

import java.util.*;

public class question {

    public static int reductionCost(int[]  num) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i: num) {
            minHeap.add(i);
        }

        int totalCost = 0;
        while(minHeap.size() > 1) {
            int cost = minHeap.poll() + minHeap.poll();
            totalCost += cost;
            minHeap.add(cost);
        }
        return totalCost;
    }
    public static void main(String[] args) {
        int[] num = {4,6,8}; // Example input array
        int minimumCost = reductionCost(num);
        System.out.println("Minimum total cost: " + minimumCost);
    }
}