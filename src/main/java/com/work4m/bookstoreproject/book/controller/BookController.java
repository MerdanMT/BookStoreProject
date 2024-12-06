package com.work4m.bookstoreproject.book.controller;
import com.work4m.bookstoreproject.book.dto.request.BookCreateRequestDto;
import com.work4m.bookstoreproject.book.dto.request.BookUpdateRequestDto;
import com.work4m.bookstoreproject.book.dto.response.BookResponseDto;
import com.work4m.bookstoreproject.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {

        private final BookService bookService;

        @GetMapping
        public List<BookResponseDto> findAll() {
            return bookService.getAllBooks();
        }

        @GetMapping("/{id}")
        public BookResponseDto findById(@PathVariable Long id) {
            return bookService.getBookById(id);
        }

        @PostMapping
        public void create(@RequestBody BookCreateRequestDto bookCreateRequestDto) {
            bookService.createBook(bookCreateRequestDto);
        }

        @PutMapping("/{id}")
        public void update(@PathVariable Long id, @RequestBody BookUpdateRequestDto bookUpdateRequestDto) {
            bookService.updateBook(id, bookUpdateRequestDto);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) {
            bookService.deleteBookById(id);
        }
}
