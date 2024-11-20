package com.example.validate2.service;

import com.example.validate2.model.Song;

import java.util.List;

public interface IMusicService {
    List<Song> findAll();
    Song findById(Long id);
    void save(Song student);
    void delete(Long id);
}