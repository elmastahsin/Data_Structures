package org.example.reverseLinkedList;

public class ReverseLinkedListSolution {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();

        for (int i = 0; i < 10; i++) list.add(i);
        list.printNodes();
        System.out.println("After reverse in one pass");
        reverse(list);
        list.printNodes();
    }

    static void reverse(MySinglyLinkedList list) {

        Node current = list.head.next;
        Node previous = list.head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        list.tail = list.head;
        list.tail.next=null;
        list.head = previous;


    }
}
