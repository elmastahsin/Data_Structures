package SLL_PhoneBook;

public class Node {
    public String name, email,lastname, phoneNumber;

    public Node(String name, String email, String lastname, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    Node next;
    Node previous;




}
