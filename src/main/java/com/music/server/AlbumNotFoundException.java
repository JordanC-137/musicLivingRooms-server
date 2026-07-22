package com.music.server;

import org.springframework.http.HttpStatus;

public class AlbumNotFoundException extends RuntimeException{

    AlbumNotFoundException(long Id){
        super("Could not find album with ID: " + Id);
    }
}
