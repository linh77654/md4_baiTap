package com.example.libarry.repository;

import com.example.libarry.model.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface IBorrowingRepository {
    @Repository
    public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {
        Optional<Borrowing> findByBorrowId(String borrowId);
    }
}
