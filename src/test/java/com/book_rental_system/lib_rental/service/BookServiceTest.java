package com.book_rental_system.lib_rental.service;

import com.book_rental_system.lib_rental.domain.Book;
import com.book_rental_system.lib_rental.domain.BookInfo;
import com.book_rental_system.lib_rental.repository.BookInfoRepository;
import com.book_rental_system.lib_rental.repository.BookRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookServiceTest {
    @Autowired
    BookService bookService;


    @BeforeEach
    void setUp() {
    }

    @Test
    void testAddBook() {
        BookInfo bookInfo = bookService.inputBook();

    }





}
