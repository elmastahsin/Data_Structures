package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        // 1. create a set
        Set<Student> set = new LinkedHashSet<>();

        // 2. add elements

        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Mike"));
        set.add(new Student(3, "Tom"));
        set.add(new Student(4, "Marry"));
        set.add(new Student(4, "Marry"));

        System.out.println(set);

        System.out.println(set.add(new Student(4, "Marry")));

        String str = "Javva Developer";
        System.out.println(firstRepeatingChar(str));

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
