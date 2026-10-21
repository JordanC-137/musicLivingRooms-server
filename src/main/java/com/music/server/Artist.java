package com.music.server;

import java.util.Objects;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Artist {
    private @Id @GeneratedValue long Id;

    private String name;
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