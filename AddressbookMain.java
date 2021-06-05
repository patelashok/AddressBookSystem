package com.company;

import java.util.Scanner;
/**
 * Added AddressBookmain class to create object of Main class.
 */
public class AddressbookMain {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        AddressBookArray addressObject = new AddressBookArray();
        String choice = "y";
        System.out.println("Welcome to Address Book Program!");
        while(true) {
            System.out.println("Enter 1: add 2: edit 3: delete 4: view 5: exit");
            System.out.println("Enter choice : ");
            int switchChoice = scan.nextInt();
            scan.nextLine();
            /**
             * i have taken 4 options in this switch case
             * According to value it'll call the method.
             * Case 1 will add new contact data.
             * Case2 will edit the contact.
             * Case3 will delete the contact data.
             * Case4 will print all the data of that Arraylist.
             * Case5 will exit from this loop.
             */
            switch(switchChoice) {
                case 1:
                    while(choice.equals("y")) {
                        System.out.println("Firstname : ");
                        String firstname = scan.nextLine();
                        System.out.println("Lastname : ");
                        String lastname = scan.nextLine();
                        System.out.println("Address : ");
                        String address = scan.nextLine();
                        System.out.println("City : ");
                        String city = scan.nextLine();
                        System.out.println("State : ");
                        String state = scan.nextLine();
                        System.out.println("Zip : ");
                        int zip = scan.nextInt();
                        System.out.println("PhoneNumber : ");
                        long phonenumber = scan.nextLong();
                        System.out.println("Email : ");
                        scan.nextLine();
                        String email = scan.nextLine();
                        System.out.println("Do you want add more contact : ");
                        choice = scan.nextLine();

                        AddressBookArray contact = new AddressBookArray(firstname, lastname, address, city, state, zip, phonenumber, email);
                        addressObject.insertContact(contact);
                    }
                    break;
                case 2:
                    System.out.println("Enter name of contact to edit : ");
                    String nameToEdit = scan.nextLine();
                    addressObject.editContact(nameToEdit);
                    break;
                case 3:
                    System.out.println("Enter name of contact to edit : ");
                    String deleteCon = scan.nextLine();
                    addressObject.delete(deleteCon);
                    break;
                case 4:
                    System.out.println("Contact List : ");
                    addressObject.printContactDetails();
                    break;
                default:
                    System.exit(0);
            }
        }

    }

}
