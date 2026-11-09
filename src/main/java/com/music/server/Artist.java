package com.music.server;

import java.util.HashSet;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GenerationType;

@Entity
public class Artist {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO)
    long Id;

    private String name;

    @OneToMany(mappedBy = "artist")
    private HashSet<Album> albums;


    public long getId(){
        return this.Id;
    }
    public String getName(){
        return this.name;
    }

    public void setId(long newId){
        this.Id = newId;
    }

    public void setName(String newName){
        this.name = newName;
    }

    /*public Album getAlbum(){
        return this.album;
    }

    public void setAlbum(Album newAlbum){
        this.album = newAlbum;
    } */

}