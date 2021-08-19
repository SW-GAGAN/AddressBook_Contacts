package com.bridgelabz;

/* @Description - To create a contacts in address book with first name, last name, address, city, state,
 * zip,mobile number.*/
public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to address book system program");
        Contacts contact = new Contacts("Gagan", "Reddy", "Heelalige",
                "Benglore", "Karnataka", 560099,
                918722289619L, "gagan@gmail.com");
        System.out.println(contact.toString());
    }
}
