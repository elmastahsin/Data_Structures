package SLL_PhoneBook;

public class PhoneBookApp {

    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();

        phoneBook.insert("A","A","A","A");
        phoneBook.insert("B","B","B","A");
        phoneBook.insert("C","C","C","A");
        phoneBook.insert("D","D","D","A");

        phoneBook.deleteByEmail("C");
        System.out.println(phoneBook.indexOf("C"));


    }
}
