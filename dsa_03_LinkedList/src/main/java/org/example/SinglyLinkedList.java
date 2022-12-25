package org.example;

import java.util.ArrayList;

public class SinglyLinkedList {
    public static void main(String[] args) {
        MySingleLinkedList myList = new MySingleLinkedList();
        System.out.println(myList.isEmpty());


        for (int i = 0; i < 10; i++) {
            myList.add(i);

        }

        myList.printNodes();

        myList.deleteById(0);
        System.out.println();
        myList.printNodes();

        myList.deleteById(2);
        System.out.println();
        myList.printNodes();

        myList.deleteById(9);
        System.out.println();
        myList.printNodes();
    }
}
