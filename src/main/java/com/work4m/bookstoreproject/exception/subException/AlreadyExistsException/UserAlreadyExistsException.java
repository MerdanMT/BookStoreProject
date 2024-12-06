package com.work4m.bookstoreproject.exception.subException.AlreadyExistsException;

import com.work4m.bookstoreproject.exception.superException.MainAlreadyExistsException;


public class UserAlreadyExistsException extends MainAlreadyExistsException {

    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
