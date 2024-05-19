package com.book_rental_system.lib_rental.repository;

import com.book_rental_system.lib_rental.domain.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookInfoRepository extends JpaRepository<BookInfo,Long> {
}
