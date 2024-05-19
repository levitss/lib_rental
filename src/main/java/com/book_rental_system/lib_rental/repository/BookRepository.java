package com.book_rental_system.lib_rental.repository;

import com.book_rental_system.lib_rental.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {

}
