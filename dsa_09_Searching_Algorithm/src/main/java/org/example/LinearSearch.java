package org.example;

public class LinearSearch {
    public static void main(String[] args) {

    }
    public int linearSearch(int [] array,int data){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==data){
                return i;
            }
        }
        return -1;
    }
}
