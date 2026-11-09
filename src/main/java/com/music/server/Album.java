package com.music.server;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Album {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO  )
    long Id;

    private String title;

    @ManyToOne(optional=false)
    @JoinColumn(name="artist_id", referencedColumnName = "Id")
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
