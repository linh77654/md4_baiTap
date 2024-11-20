package com.example.validate2.repository;


import com.example.validate2.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMusicRepository extends JpaRepository<Song, Long> {
}