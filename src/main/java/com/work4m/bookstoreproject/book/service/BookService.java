package com.work4m.bookstoreproject.book.service;

import com.work4m.bookstoreproject.book.dto.request.BookCreateRequestDto;
import com.work4m.bookstoreproject.book.dto.request.BookUpdateRequestDto;
import com.work4m.bookstoreproject.book.dto.response.BookResponseDto;

import java.util.List;

public interface BookService {

    List<BookResponseDto> getAllBooks();

    BookResponseDto getBookById(Long id);

    void createBook(BookCreateRequestDto bookCreateRequestDto);

    void deleteBookById(Long id);

    void updateBook(Long id, BookUpdateRequestDto bookUpdateRequestDto);

}
