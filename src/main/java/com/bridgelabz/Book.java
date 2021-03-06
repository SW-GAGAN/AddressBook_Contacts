package com.bridgelabz;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Book {
    static ArrayList<Contact> contactlist = new ArrayList<Contact>();

    /* This method is used to delete the contact if exists in the contact book
    @param takes firstname as input
    @return boolean value true if removed else false
     */

    public boolean removeContact(String name) {
        if (contactlist.size() > 0) {
            for (int i = 0; i < contactlist.size(); i++) {
                Contact contact = contactlist.get(i);
                if ((contact.firstname + contact.lastname).equals(name)) {
                    contactlist.remove(i);
                    return true;
                } else {
                    System.out.println("name not available to edit");
                    return false;
                }
            }
        } else {
            System.out.println("No contacts");

        }
        return false;
    }

    /* This method is used to add the contact, if already exists in the contact book
    not adding else adding
    @param takes contact input
    @return boolean value true if added else false
     */

    public boolean addNewContact(Contact contact) {
        int bit_add = 0;
        if (contactlist.size() > 0) {
            int i = 0;
            while (i < contactlist.size() && bit_add == 0) {
                Contact contactPresent = contactlist.get(i);
                if (contact.equals(contactPresent)) {
                    bit_add = 1;
                    System.out.println("name available Present duplicate not allowed");
                    return false;
                }
                i++;
            }
            if (bit_add == 0) {
                contactlist.add(contact);
                return true;
            }
        }
        contactlist.add(contact);
        return true;
    }

    /* This method is used to update the contact,only  if exists in the contact book
    @param takes String oldname and newname as an input
    @return boolean value true if updated else false
     */

    public boolean updateContact(Contact oldcontact, Contact newContact) {
        boolean check = checkContactExtists(oldcontact);
        if (check == false) {
            if (contactlist.size() > 0) {
                for (int i = 0; i < contactlist.size(); i++) {
                    if (contactlist.get(i).equals(oldcontact)) {
                        contactlist.add(i, newContact);
                        return true;
                    }
                }
            } else {
                System.out.println("name not available to edit");
                return false;
            }
        }
        System.out.println("No contacts");
        return false;
    }

    /* This method is used to print the contacts
     */

    public void printContactList() {
        System.out.println("You have " + contactlist.size() + " contacts in your list");
        for (int i = 0; i < contactlist.size(); i++) {
            Contact v = contactlist.get(i);
            System.out.println(v.firstname + "\n" + v.lastname + "\n" + v.PhoneNumber + "\n" + v.email + "\n" + v.city + "\n" + v.state + "\n" + v.zip);
        }
    }

    /* This method is used to search the contact,only  if exists in the contact book
    @param takes contacts
    @return boolean value true if present else false
     */

    public boolean checkContactExtists(Contact contact) {
        if (contactlist.size() > 0) {
            int i = 0;
            while (i < contactlist.size()) {
                Contact contactPresent = contactlist.get(i);
                if (contact.equals(contactPresent)) {
                    System.out.println("Contact Exists");
                    return true;
                }
                i++;
            }
            return false;
        }
        return false;
    }

    /* This method is used to search the contact,only  if exists in the contact book
    @param takes contacts
    @return contact value true if present else null
     */

    public Contact checkContactExistsStream(Contact contact) {
        return contactlist.stream().filter(contac -> contac.equals(contact))
                .findAny()
                .orElse(null);
    }


}
