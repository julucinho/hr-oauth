package com.julucin.hroauth.exceptions;

public class KeyDoesNotExistException extends RuntimeException{
    public KeyDoesNotExistException(){
        super("Key doesn't exist.");
    }
}
