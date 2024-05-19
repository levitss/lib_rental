package com.book_rental_system.lib_rental.repository;

import com.book_rental_system.lib_rental.domain.RentalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<RentalRecord,Long> {
}
