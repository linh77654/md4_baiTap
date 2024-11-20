package com.example.validate2.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MusicDto implements Validator {
    private Long id;
    private String nameSong;
    private String artist;
    private String album;

    public MusicDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return MusicDto.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        MusicDto musicDto = (MusicDto) target;
        if (musicDto.getNameSong() == null || musicDto.getNameSong().trim().isEmpty()) {
            errors.rejectValue("nameSong", null, "songDto.nameSong.empty");

        } else if (!musicDto.getNameSong().matches("^(?!\\s*$)[A-Za-zÀ-ỹ0-9\\s]{1,800}$")) {
            errors.rejectValue("nameSong", null, "Không chứa ký tự đặc biệt, tối đa 800 ký tự");
        }
        if (musicDto.getArtist() == null || musicDto.getArtist().trim().isEmpty()) {
            errors.rejectValue("artist", null, "Tên nghệ sĩ không được trống");
        } else if (!musicDto.getArtist().matches("^(?!\\s*$)[A-Za-zÀ-ỹ0-9\\s]{1,300}$")) {
            errors.rejectValue("artist", null, "Không chứa ký tự đặc biệt, tối đa 300 ký tự");
        }
        if (musicDto.getAlbum() == null || musicDto.getAlbum().trim().isEmpty()) {
            errors.rejectValue("album", null, "Tên album không được trống");

        } else if (!musicDto.getAlbum().matches("^(?!\\s*$)[A-Za-zÀ-ỹ0-9\\s]{1,1000}$")) {
            errors.rejectValue("album", null, "Không chứa ký tự đặc biệt, tối đa 1000 ký tự");
        }
    }
}