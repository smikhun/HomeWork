package ua.artcode.library;
import java.util.ArrayList;
/**
 * Created by Andriy on 19.11.2015.
 */
public class Library {

    private ArrayList<User> users;
    private ArrayList<User> blocUser;
     ArrayList<Book> books;

    Library(){
        this.users = new ArrayList<>();
        this.blocUser = new ArrayList<>();
        this.books = new ArrayList<>();


    }

    public void showUsers(){
        for (int i=0; i<users.size();i++){
            System.out.println(users.get(i).firstname + " " + users.get(i).lastname );
        }
    }
    public void showBook(){
        for (int i=0; i<books.size();i++){
            System.out.println(books.get(i).name + " " + books.get(i).autor + " " + books.get(i).year);
        }
    }
    public void showBlocUser(){
        for (int i=0; i<blocUser.size();i++){
            System.out.println(blocUser.get(i));
        }
    }


    public void addUsers(User name){
        users.add(name);
    }

    public void addBooks(Book bookname){
        books.add(bookname);
    }
    public void addBlocUsers(User nameUsers){
        blocUser.add(nameUsers);
    }

    public boolean checkUsersBloc(User user){
        boolean tmp = false;
        for (int i=0; i<blocUser.size();i++){
            if(blocUser.get(i).equals(user)){
                tmp = true;
            }
        }
        return tmp;
    }

    public void upYear(int year){
        System.out.println("Books up year " + year);
        for (int i=0; i<books.size();i++){
            if(books.get(i).year > year) {
                System.out.println(books.get(i).name + " " + books.get(i).autor + " " + books.get(i).year);
            }
        }

    }

    public void showAutorBok(String autor){

        for (int i=0; i<books.size();i++){
            if(books.get(i).autor.equals(autor)) {
                System.out.println(books.get(i).name + " " + books.get(i).autor + " " + books.get(i).year);
            }
        }

    }

    public void showBookInUsers(){
        for (int i=0; i<users.size();i++){
            System.out.println(users.get(i).lastname);
            for (int y = 0; y < 3; y++){
            System.out.println(users.get(i).takenbook[y]);}

        }
    }

    public void showBookInUser(User user){
        for (int i=0; i<users.size();i++){
            if(users.get(i).lastname.equals(user)) {

                System.out.println(users.get(i).lastname);
                for (int y = 0; y < 3; y++) {
                    System.out.println(users.get(i).takenbook[y]);
                }
            }

        }
    }

}
