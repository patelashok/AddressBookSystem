package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Added AddressbookArray class to add an arraylist code in it.
 * Here i modified the access of the Contactlist to protected.
 * Because protected objects can be accessed in inner classes.
 */
public class AddressBookArray {
    List<Contact> contact = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    /**
     * To add contact of a person in Address Book.
     */

    public void addContact() {
        System.out.println("Enter Firstname:");
        String firstname = input.nextLine();

        System.out.println("Enter Lastname:");
        String lastname = input.nextLine();
        /**
         * Refactor the add contact function
         * to check no duplicate firstname or lastname exists.
         */
        for(int check = 0; check < contact.size(); check++) {
            if(contact.get(check).getFirstName().equalsIgnoreCase(firstname)) {
                if(contact.get(check).getLastName().equalsIgnoreCase(lastname)) {
                    System.out.println("Name Already Exist.! Please try again.. : ");
                    return;
                }
            }
        }

        System.out.println("Enter Address:");
        String address = input.nextLine();

        System.out.println("Enter City:");
        String city = input.nextLine();

        System.out.println("Enter State:");
        String state = input.nextLine();

        System.out.println("Enter ZipCode:");
        int zipcode = input.nextInt();

        System.out.println("Enter PhoneNumber:");
        Long phoneNumber = input.nextLong();

        System.out.println("Enter Email-Id:");
        String email = input.nextLine();

         Contact AddressBook = new Contact(firstname, lastname, address, city, state,zipcode, phoneNumber,email);
        contact.add(AddressBook);
        System.out.println(" Firstname=" + firstname + ", Lastname=" + lastname + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode +
                ", PhoneNumber=" + phoneNumber);
        System.out.println("Contact Added Successfully");
    }


    /**
     * performing the operation for edit contact for the existing contact.
     *
     * @param firstname
     *
     */
    public void editContact(String firstname) {
        for (int i = 0; i < contact.size(); ++i) {
            if( contact.get(i).getFirstName().equalsIgnoreCase(firstname)) {
                Contact AddressBook = contact.get(i);
                System.out.println(AddressBook.getFirstName() + "Edit your detail :");
                System.out.println(AddressBook.getFirstName() + "Edit your Address :");
                input.next();
                String address = input.nextLine();
                AddressBook.setAddress(address);
                System.out.println( AddressBook.getFirstName() + " " + "Edit your city :");
                input.next();
                String city = input.nextLine();
                AddressBook.setCity(city);
                System.out.println( AddressBook.getFirstName() + " "  + "Edit your State :");
                input.next();
                String state = input.nextLine();
                AddressBook.setState(state);
                System.out.println( AddressBook.getFirstName() + " " + "Edit your zipcode :");
                input.next();
                int zipcode = input.nextInt();
                AddressBook.setZip(zipcode);
                System.out.println( AddressBook.getFirstName() + " " + "Edit your Phone Number :");
                input.next();
                Long phoneNumber = input.nextLong();
                AddressBook.setPhoneNo(phoneNumber);
                System.out.println( AddressBook.getFirstName() + " " + "AddressBook Updated Successfully.!");
            }
        }
    }

    /**
     * performing the operation for delete contact from the existing contact.
     *
     */
    public void deleteContact(String firstname) {
        for (int i = 0; i < contact.size(); i++) {
            if(contact.get(i).getFirstName().equalsIgnoreCase(firstname)) {
                Contact AddressBook = contact.get(i);
                contact.remove(AddressBook);
                System.out.println("Contact Deleted Successfully.!");
            }
        }
    }

}