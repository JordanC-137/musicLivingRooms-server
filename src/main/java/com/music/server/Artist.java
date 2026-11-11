package com.music.server;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Artist {
    private @Id @GeneratedValue
    long Id;

    private String name;

    @OneToMany(mappedBy = "artist")
    private List<Album> albums;


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
}