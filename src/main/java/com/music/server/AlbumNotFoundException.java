package com.music.server;

import org.springframework.http.HttpStatus;

public class AlbumNotFoundException extends RuntimeException{

    AlbumNotFoundException(Long Id){
        super("Could not find album ID: " + Id);
    }
}
