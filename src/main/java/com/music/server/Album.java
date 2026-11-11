package com.music.server;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;

@Entity
public class Album {
    private @Id @GeneratedValue
    long Id;

    private String title;

    @ManyToOne
    @JoinColumn(name="artist_id")
    private Artist artist;

    public long getId(){
        return this.Id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setId(long newId){
        this.Id = newId;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

}
