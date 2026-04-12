package com.example.lld.library;

import com.example.lld.library.exceptions.BookNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private List<Book> books = new ArrayList<>();
    private Map<Integer,Integer> bookToUserMap = new HashMap<>();

    private boolean bookExist(int bookId){
        return books.stream().anyMatch(book->book.getBook_id()==bookId);
    }

    private boolean isBorrowed(int bookId){
        return bookToUserMap.containsKey(bookId);
    }

    public void borrowBook(int bookId,int userId){
        if(!bookExist(bookId)){
            throw new BookNotFoundException("Book doesn't exist");
        }
        if(isBorrowed(bookId)) {
            throw new BookNotFoundException("Book doesn't exist");
        }

        bookToUserMap.put(bookId,userId);

    }

    public void returnBook(int bookId){
        if(!isBorrowed(bookId)) {
            throw new BookNotFoundException("Book doesn't exist");
        }
        bookToUserMap.remove(bookId);
    }

    public void addBook(Book book){
        books.add(book);
    }
}
