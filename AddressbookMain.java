package com.company;

import java.util.Scanner;
/**
 * Added AddressBookmain class to create object of Main class.
 */
public class AddressbookMain {
    private void choice() {
        boolean result = true;
        Scanner input = new Scanner(System.in);
        AddressBookArray addressBook = new AddressBookArray();

        /**
         * switch case for each cases to be performed
         * According to the options it'll call the method.
         */
        while(result) {
            System.out.println("Enter option to make changes : \n[press 1 to add new Contact" +
                    "\n press 2 to Edit existing contacts" +"\n press 3 to delete a contact detail " + "\n press 0 to quit ]");
            int option = input.nextInt();
            switch (option) {
                case 1 :
                    addressBook.addContact();
                    break;
                case 2 :
                    System.out.println("Enter your firstname to Edit your details..");
                    String firstname = input.next();
                    addressBook.editContact(firstname);
                    break;
                case 3 :
                    System.out.println("Enter your Firstname to delete your details :");
                    String firstName = input.next();
                    addressBook.deleteContact(firstName);
                    break;
                default:
                    result = false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book");
        /**
         * Here i have created an object of Address book class with the parameters
         * it will assign inside the constructor and initialised too.
         */
        Contact addressBook = new Contact("Ashok", "Patel", "Pali",
                "Raipur", "Rajasthan", 306307, 343434343,"ap1@gmail.com");
        addressBook.printContactDetails();
        /**
         * Here i have created one object of Addressbookmain class named main.
         * which will call the choice method to execute all the functions.
         */
        AddressbookMain main = new AddressbookMain();
        main.choice();
    }
}