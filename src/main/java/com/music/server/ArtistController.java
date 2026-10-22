package com.music.server;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
public class ArtistController {
    private final ArtistRepository repository;

    ArtistController(ArtistRepository repository){
        this.repository = repository;
    }

    @GetMapping("/artists")
    public List<Artist> getArtist(){
        return repository.findAll();
    }

    @PostMapping("/artists")
    Artist createArtist(@RequestBody Artist newArtist){
        return repository.save(newArtist);
    }
}
