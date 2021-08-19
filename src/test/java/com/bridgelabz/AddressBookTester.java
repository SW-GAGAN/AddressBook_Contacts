package com.bridgelabz;

import com.bridgelabz.AddressBook;
import com.bridgelabz.Book;
import com.bridgelabz.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddressBookTester {
    Contact contact1 = new Contact("Gagan", "Reddy", "Bengalur", "Karnataka",
            560076, "9663393660", "gaganreddy@gmail.com");
    Contact contact2 = new Contact("Srini", null, "Channai", "Tamilnadu",
            560076, "9662293660", "srinivar@gmail.com");
    Contact contact3 = new Contact("Raju", null, "Mumbai", "Mahastrea",
            560076, "9664493660", "nivar@gmail.com");
    Contact contact4 = new Contact("Gagan", "Reddy", "Bengalur", "Karnataka",
            560076, "9667793660", "gaganreddy@gmail.com");

    @Test
    public void givenContactToAdd_whenAlredyExists_shouldReturnFalse() {
        Contact contact1 = new Contact("Manu", "Kv", "Bengaluru", "Karnataka",
                560076, "9663393660", "manukvshetty@gmail.com");
        Contact contact2 = new Contact("Srinivar", null, "Chennai", "Tamilnadu",
                560076, "9663393660", "srinivar@gmail.com");
        Contact contact3 = new Contact("Raju", null, "Mumbai", "Maharashtra",
                560076, "9663393660", "nivar@gmail.com");
        Contact contact4 = new Contact("Manu", "Kv", "Bengaluru", "Karnataka",
                560076, "9663393660", "manukvshetty@gmail.com");
        Book book = new Book();
        book.addNewContact(contact1);
        Assertions.assertEquals(false, book.addNewContact(contact1));

    }

    @Test
    public void givenContactToSearch_whenExists_shouldReturnContact() {
        Contact contact1=new Contact("Gagan","Reddy","Bengaluru","Karnataka",
                560076,"9663393660","gaganreddy@gmail.com");
        Contact contact2=new Contact("Srini",null,"Chennai","Tamilnadu",
                560076,"9662293660","srinivar@gmail.com");
        Contact contact3=new Contact("Raju",null,"Mumbai","Maharashtra",
                560076,"9664493660","nivar@gmail.com");
        Contact contact4=new Contact("Gagan","Reddy","Bengaluru","Karnataka",
                560076,"9667793660","gaganreddy@gmail.com");
        Book book = new Book();
        book.addNewContact(contact1);
        book.addNewContact(contact2);
        book.addNewContact(contact3);
        Assertions.assertEquals(contact3, book.checkContactExistsStream(contact3));
    }

    @Test
    public void givenCityToSearch_whenExists_shouldReturnContactList() {
        Book book = new Book();
        book.addNewContact(contact1);
        book.addNewContact(contact3);
        book.addNewContact(contact2);
        List<Contact> cityList = book.checkContactByCityStream("Bengaluru");
        List<Contact> cityList2 = book.checkContactByCityStream("Chennai");
        Assertions.assertEquals(2, cityList.size());
        Assertions.assertEquals(1, cityList2.size());
    }

    @Test
    public void givenStateToSearch_whenExists_shouldReturnContactList() {
        Book book = new Book();
        book.addNewContact(contact1);
        book.addNewContact(contact3);
        book.addNewContact(contact2);
        book.addNewContact(contact4);
        List<Contact> stateList = book.checkContactByStateStream("Karnataka");
        List<Contact> stateList2 = book.checkContactByStateStream("Maharashtra");
        Assertions.assertEquals(3, stateList.size());
        Assertions.assertEquals(1, stateList2.size());
    }


}