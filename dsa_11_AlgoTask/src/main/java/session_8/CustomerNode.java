package session_8;

public class CustomerNode {

CustomerNode leftChild,rightChild;
String fistName;
String lastName;
String email;
String number;

    public CustomerNode(String fistName, String lastName, String email, String number) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.number = number;
    }
}
