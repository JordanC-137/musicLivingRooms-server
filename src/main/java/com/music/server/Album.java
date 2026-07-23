package com.music.server;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;


@Entity
public class Album {
    private @Id
    @GeneratedValue long Id;

    private String title;

    Album() {}

    public Album(String title){
        System.out.println("1 arg constructor called");
        this.title = title;
    }

    public long getId(){
        return this.Id;
    }

    public long getTitle(){
        return this.Id;
    }

    public void setId(long newId){
        this.Id = newId;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if((o instanceof Album) == false){
            return false;
        }
        else {
            Album otherAlbum = (Album) o;
            if(this.title == otherAlbum.title){
                return true;
            }
            else{
                return false;
            }
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.Id, this.title);
    }

    @Override
    public String toString(){
        return this.title;
    }
}
