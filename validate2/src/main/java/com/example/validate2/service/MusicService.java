package com.example.validate2.service;

import com.example.validate2.model.Song;
import com.example.validate2.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    IMusicRepository songRepository;

    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public Song findById(Long id) {
        return songRepository.findById(id).get();
    }

    @Override
    public void save(Song student) {
        songRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        songRepository.deleteById(id);
    }
}