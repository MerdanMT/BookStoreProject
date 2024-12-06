package com.work4m.bookstoreproject.exception.subException.NotFoundException;

import com.work4m.bookstoreproject.exception.superException.MainNotFoundException;

public class BookNotFoundException extends MainNotFoundException {
    public BookNotFoundException(String message) {
        super(message);
    }
}
