package com.book_rental_system.lib_rental.repository;

import com.book_rental_system.lib_rental.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
