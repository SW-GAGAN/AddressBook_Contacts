package com.bridgelabz;

import java.util.*;

public class AddressBook {

    /* @Description - To create a contacts in address book with first name, last name, address, city, state,
     * zip,mobile number.*/

    public Contact CreateContact() {
        Contact contact = new Contact();
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the below details");
        System.out.println("Firstname");
        String fname = s.next();
        contact.firstname = fname;
        System.out.println("lastname");
        String lname = s.next();
        contact.lastname = lname;
        System.out.println("city");
        String city = s.next();
        contact.city = city;
        System.out.println("state");
        String state = s.next();
        contact.state = state;
        System.out.println("zip");
        int zip = s.nextInt();
        contact.zip = zip;
        System.out.println("phoneNumber");
        String phoneNumber = s.next();
        contact.PhoneNumber = phoneNumber;
        System.out.println("email");
        String email = s.next();
        contact.email = email;
        return contact;
    }

    public Contact createContact(String firstname, String lastname, String city, String state, int zip, String mob, String email) {
        Contact contact = new Contact();
        contact.firstname = firstname;
        contact.lastname = lastname;
        contact.city = city;
        contact.state = state;
        contact.zip = zip;
        contact.PhoneNumber = mob;
        contact.email = email;
        return contact;

    }
}