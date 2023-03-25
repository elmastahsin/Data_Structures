package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {
        // create arraylist and a class
        List<Student> students = new ArrayList<>();
        // add elements to arraylist

        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Mike"));
        students.add(new Student(3, "Tom"));
        students.add(new Student(4, "Marry"));

        // Iteraiton on arrayList

        System.out.println("Printing with legacy for-loop");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        // Forward iteration
        System.out.println("Printing forward with iterator");
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Backward Iterator

        System.out.println("Printing backward with iterator");
        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }
        // for each loop
        System.out.println("Printing  with foreach loop");

        for (Student eachStudent: students){
            System.out.println(eachStudent);
        }

        //Lambda
        System.out.println("Printing  with Lambda");
       students.forEach(System.out::println);
        //Sort Elements in
        System.out.println("sorting with Comparator Interface by Id descending...");

        Collections.sort(students,new sortById());
        students.forEach(System.out::println);
        System.out.println("sorting with Comparator Interface by Name descending...");

        Collections.sort(students,new sortByName());
        students.forEach(System.out::println);
    }
    static class sortById implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getId()-o1.getId();
        }
    }
    static class sortByName implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getName().compareToIgnoreCase(o1.getName());
        }
    }
}
