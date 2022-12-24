package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class MapReview {
    public static void main(String[] args) {
        // create hash map





    }
        public static Character firstRepeatingChar(String str) {
            // Time Complexity O(n)
            //create a hashset
            Set<Character> setChar = new LinkedHashSet<>();
            // Space Complexity O(n)


            // iterate over the char array and add chars into hashSet
            for (Character each : str.toCharArray()) {
                // if add ops is false return char
                if (!(setChar.add(each))) {
                    return each;
                }

            }
            return null;

    }
}
