package org.example;

import java.util.*;

public class MapReview {
    public static void main(String[] args) {
        // create hash map
        Map<Integer, String> studentsMap = new HashMap<>();

        // add element

        studentsMap.put(1, "Jack");
        studentsMap.put(2, "John");
        studentsMap.put(3, "Tom");
        studentsMap.put(4, "Maria");

        String str = "JJJavvaDDevelloopperr";
        System.out.println(firstNonRepeatingChar(str));

    }

    public static Character firstNonRepeatingChar(String str) {
        // Time Complexity O(n)
        //create a hashMap
        Map<Character, Integer> countMap = new TreeMap<>();
        // Space Complexity O(n)

        // frewuency of chars
        int count ;
        for (Character each : str.toCharArray()) {
            if (countMap.containsKey(each)) {
                count = countMap.get(each);
                countMap.put(each, ++count);
            } else {
                countMap.put(each, 1);
            }
        }
//start from beginngi and chec there is a char with frequency 1

        for (Character each : str.toCharArray()) {
            if (countMap.get(each) == 1) {
                return each;
            }

        }
        return null;
    }
}
