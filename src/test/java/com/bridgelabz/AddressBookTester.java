package com.bridgelabz;

import com.bridgelabz.AddressBook;
import com.bridgelabz.Book;
import com.bridgelabz.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddressBookTester {

    @Test
    public void givenContactToAdd_whenAlredyExists_shouldReturnFalse(){
        Contact contact1=new Contact("Gagan","Reddy","Bengalur","Karnataka",
                560076,"9663393660","gaganreddy@gmail.com");
        Contact contact2=new Contact("Srini",null,"Channai","Tamilnadu",
                560076,"9662293660","srinivar@gmail.com");
        Contact contact3=new Contact("Raju",null,"Mumbai","Mahastrea",
                560076,"9664493660","nivar@gmail.com");
        Contact contact4=new Contact("Gagan","Reddy","Bengalur","Karnataka",
                560076,"9667793660","gaganreddy@gmail.com");
        Book book=new Book();
        book.addNewContact(contact1);
        Assertions.assertEquals(false,book.addNewContact(contact1));

    }

    @Test
    public void givenContactToSearch_whenExists_shouldReturnContact(){
        Contact contact1=new Contact("Gagan","Reddy","Bengalur","Karnataka",
                560076,"9663393660","gaganreddy@gmail.com");
        Contact contact2=new Contact("Srini",null,"Channai","Tamilnadu",
                560076,"9662293660","srinivar@gmail.com");
        Contact contact3=new Contact("Raju",null,"Mumbai","Mahastrea",
                560076,"9664493660","nivar@gmail.com");
        Contact contact4=new Contact("Gagan","Reddy","Bengalur","Karnataka",
                560076,"9667793660","gaganreddy@gmail.com");
        Book book=new Book();
        book.addNewContact(contact1);
        book.addNewContact(contact2);
        book.addNewContact(contact3);
        Assertions.assertEquals(contact3,book.checkContactExistsStream(contact3));
    }


}