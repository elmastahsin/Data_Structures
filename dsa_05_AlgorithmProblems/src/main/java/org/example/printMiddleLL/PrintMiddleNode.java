package org.example.printMiddleLL;

public class PrintMiddleNode {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();
        for (int i = 1; i <= 7; i++) {
            list.add(i);
        }
        printMiddle(list);
    }

    public static void printMiddle(MySinglyLinkedList list) {
        Node a = list.head;
        Node b = list.head;

        //iterate oveer the linked list
        while (b != list.tail && b.next != list.tail) {
            a = a.next;// single jump
            b = b.next.next;// double jump
        }
        if (b == list.tail) System.out.println(a.id);// on tail odd number of nodes
        else System.out.println(a.id + " " + a.next.id); // before tail even number of nodes
    }

}
