package org.example;

public class LinkedListDemo {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next= node2;
        node2.next= node3;
        node3.next= node4;


        System.out.println(node1.id);

        System.out.println(node1.next.id + " Id of the the second node");



        System.out.println("Next address: " + node1.next);


    }



}
