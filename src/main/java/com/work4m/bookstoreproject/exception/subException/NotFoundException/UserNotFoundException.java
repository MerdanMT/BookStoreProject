package com.work4m.bookstoreproject.exception.subException.NotFoundException;

import com.work4m.bookstoreproject.exception.superException.MainNotFoundException;

public class UserNotFoundException extends MainNotFoundException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
