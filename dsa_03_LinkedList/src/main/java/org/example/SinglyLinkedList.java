package org.example;

import java.util.ArrayList;

public class SinglyLinkedList {
    public static void main(String[] args) {
//        MySingleLinkedList myList = new MySingleLinkedList();
//        System.out.println(myList.isEmpty());
//
//
//        for (int i = 0; i < 10; i++) {
//            myList.add(i);
//
//        }
//
//        myList.printNodes();
//
//        myList.deleteById(0);
//        System.out.println();
//        myList.printNodes();
//
//        myList.deleteById(2);
//        System.out.println();
//        myList.printNodes();
//
//        myList.deleteById(9);
//        System.out.println();
//        myList.printNodes();
//        System.out.println();
//
//        System.out.println("İndex of id 6: " + myList.indexOf(6));
//        myList.printNodes();
//        System.out.println();
//        System.out.println("*********");
//
//
//        myList.add(12);
//        myList.printNodes();
//        System.out.println();
//        System.out.println("*********");
//        myList.addFirst(12);
//        myList.printNodes();
//        System.out.println();
//
//        System.out.println("kth item from last: " + myList.getKthItemFromLast(3));
//        myList.deleteKthItemFromLast(3);
//        myList.printNodes();
//



        MySingleLinkedList myList2 = new MySingleLinkedList();
        myList2.add(0);
        myList2.add(1);
        myList2.add(0);
        myList2.add(0);
        myList2.add(1);
        myList2.add(1);


        System.out.println(myList2.getNumber());


    }

}
