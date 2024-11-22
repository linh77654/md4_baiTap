package com.example.libarry.repository;

import com.example.libarry.model.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IBorrowingRepository  extends JpaRepository<Borrowing, Long> {


    Optional<Object> findByBorrowId(String borrowId);
}
