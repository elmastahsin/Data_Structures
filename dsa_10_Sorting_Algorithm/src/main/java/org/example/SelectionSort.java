package org.example;

public class SelectionSort {

    public static int []selectionSort(int []array){
        int [] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i+1; j <array.length ; j++) {
                if (min >array[j]){
                    min=array[j];
                }
            }
            result[i]=min;

        }
        return result;
    }
}
