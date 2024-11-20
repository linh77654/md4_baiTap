package com.example.validate2.controller;

import com.example.validate2.dto.MusicDto;
import com.example.validate2.model.Song;
import com.example.validate2.service.IMusicService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MusicController {
    @Autowired
    IMusicService songService;
    @GetMapping("")
    public String index(Model model) {
        List<Song> list = songService.findAll(); ;
        model.addAttribute("listSong", list);
        return "home";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("songDto", new MusicDto());
        return "add";
    }
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("songDto") MusicDto musicDto, BindingResult bindingResult) {
        new MusicDto().validate(musicDto, bindingResult);
        if (bindingResult.hasErrors()) {

            return "add";
        }
        Song song = new Song();
        BeanUtils.copyProperties(musicDto, song);
        songService.save(song);
        return "redirect:/";

    }
    @GetMapping("/edit")
    public String edit(@RequestParam("id") Long songId, Model model) {
        Song song = songService.findById(songId);
        model.addAttribute("song", song);
        return "edit";}
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("song") MusicDto musicDto, BindingResult bindingResult) {
        new MusicDto().validate(musicDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "edit";
        }
        Song song = new Song();
        BeanUtils.copyProperties(musicDto, song);
        songService.save(song);
        return "redirect:/";
    }
    @PostMapping("/delete")
    public String delete(@RequestParam("id") Long songId, RedirectAttributes redirectAttributes) {
        songService.delete(songId);
        redirectAttributes.addFlashAttribute("success", true);
        return "redirect:/";

    }

}
