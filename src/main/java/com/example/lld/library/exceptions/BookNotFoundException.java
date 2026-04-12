package com.example.lld.library.exceptions;

public class BookNotFoundException extends  RuntimeException{
    public BookNotFoundException(String message){
        super(message);
    }
}
