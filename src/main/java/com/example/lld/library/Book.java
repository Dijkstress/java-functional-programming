package com.example.lld.library;

public class Book {
    private int book_id;
    private String book_name;

    public Book(int book_id,String book_name){
        this.book_id=book_id;
        this.book_name=book_name;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
}
