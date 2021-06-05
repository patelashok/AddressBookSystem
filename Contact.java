package com.company;


/**
 * Here i have imported Scanner to take user input.
 * imported ArrayList to store the values in an ArrayList.
 */
public class Contact {
    public String firstname, lastname;
    public String address, city, state;
    public int zip;
    public long phoneNumber;
    public String email;

    /**
     * This is a parameterized constructor having the given parameters.
     * @param firstname
     * @param lastname
     * @param address
     * @param city
     * @param state
     * @param zip
     * @param phonenumber
     * @param email
     */
    public Contact(String firstname, String lastname, String address, String city, String state, int zip, long phonenumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phonenumber;
        this.email = email;
    }

     public Contact() {

     }

     /**
     * these get methods are used to get the values according to the user input.
     * @return
     */
    public String getFirstName() {
        return firstname;
    }
    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }
    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastName) {
        this.lastname = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public long getPhoneNo() {
        return phoneNumber;
    }
    public void setPhoneNo(long phno) {
        this.phoneNumber = phno;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



     /**
      * This method will display the data of the addressbook.
      */
     public void printContactDetails() {
         System.out.println("Firstname : " + getFirstName());
         System.out.println("Lastname : " + getLastName());
         System.out.println("Address : " + getAddress());
         System.out.println("City : " + getCity());
         System.out.println("State : " + getState());
         System.out.println("Zip : " + getZip());
         System.out.println("PhoneNumber : " + getPhoneNo());
         System.out.println("Email : " + getEmail());

     }
 }
