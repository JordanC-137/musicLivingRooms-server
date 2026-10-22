package com.music.server;

import java.util.HashSet;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Artist {
    private @Id @GeneratedValue long Id;

    private String name;

    @OneToMany(mappedBy = "artist")
    private HashSet<Album> albums;

    Artist() {}

    public Artist(String name){
        this.name = name;
    }

    public long getId(){
        return this.Id;
    }
    public String getName(){
        return this.name;
    }

    public void setId(long newId){
        this.Id = newId;
    }

    public void setTitle(String newName){
        this.name = newName;
    }

    /*public Album getAlbum(){
        return this.album;
    }

    public void setAlbum(Album newAlbum){
        this.album = newAlbum;
    } */

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if((o instanceof Artist) == false){
            return false;
        }
        else {
            Artist otherArtist = (Artist) o;
            if(this.name.equals(otherArtist.name)){
                return true;
            }
            else{
                return false;
            }
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.Id, this.name);
    }

    @Override
    public String toString(){
        return String.format("Artist (%s)", this.name);
    }
}