package org.example;

public class SinglyLinkedList {
    public static void main(String[] args) {
        MySingleLinkedList myList = new MySingleLinkedList();
        System.out.println(myList.isEmpty());


        for (int i = 0; i < 10; i++) {
            myList.add(i);

        }

        myList.printNodes();
    }
}
