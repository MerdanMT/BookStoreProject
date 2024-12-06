package com.work4m.bookstoreproject;

import org.mapstruct.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Mapper
@ComponentScan(basePackages = "com.work4m.bookstoreproject.book.mapper")
@ComponentScan(basePackages = "com.work4m.bookstoreproject.user.mapper")
@ComponentScan(basePackages = "com.work4m.bookstoreproject.sale.mapper")

public class BookStoreProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookStoreProjectApplication.class, args);
    }

}
