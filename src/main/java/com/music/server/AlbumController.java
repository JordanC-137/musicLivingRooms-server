package com.music.server;
import com.music.server.AlbumNotFoundException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {
    private final AlbumRepository repository;

    AlbumController(AlbumRepository repository){
        this.repository = repository;
    }

    @GetMapping("/albums")
    public List<Album> getAlbums(){
        return repository.findAll();
    }

    @GetMapping("/albums/{id}")
    public Album getAlbum(long id){
        return repository.findById(id)
        .orElseThrow(() -> new AlbumNotFoundException(id));
    }

    @PostMapping("/albums")
    public void createAlbum(@RequestBody Album newAlbum){
        repository.save(newAlbum);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteAlbum(long id){
        repository.deleteById(id);;
    }
}
