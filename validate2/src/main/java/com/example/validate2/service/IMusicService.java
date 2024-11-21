package com.example.validate2.service;

import com.example.validate2.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();
    Music findById(Long id);
    void save(Music student);
    void delete(Long id);
}