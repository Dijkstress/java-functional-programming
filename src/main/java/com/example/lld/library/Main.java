package com.example.lld.library;

import com.example.lld.library.exceptions.BookNotFoundException;

public class Main {

    public static void main (String[] args){

        Library library = new Library();
        library.addBook(new Book(1,"Book A"));
        library.addBook(new Book(2,"Book B"));

        User user1 = new User(1,"user 1");

        try{
            library.borrowBook(3,1);
        }catch (BookNotFoundException e){
            System.out.println(e.getMessage());
        }
        library.borrowBook(2,1);


    }

}
