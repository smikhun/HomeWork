package ua.artcode.library;

/**
 * Created by Andriy on 19.11.2015.
 */
public class User {

     String firstname;
     String lastname;
     String address;
     String pasportdata;
     Book[] takenbook;
     int count;


    User(String firstname, String lastname, String address, String pasportdata, int count){

        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.pasportdata = pasportdata;
        this.takenbook = new Book[3];
        this.count = count;
    }

    public void addUser(){

    }

    public void giveBookUsers(Book nameBook){
            if (count < 3){
            takenbook[count] = nameBook;
        }else {System.out.println("Your limit expires");}

    }





}
