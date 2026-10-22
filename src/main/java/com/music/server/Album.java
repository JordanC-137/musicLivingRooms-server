package com.music.server;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;

//import com.music.server.Artist;

@Entity
public class Album {
    private @Id
    @GeneratedValue long Id;

    private String title;

    @ManyToOne(optional=false)
    @JoinColumn(name="artist_id", referencedColumnName = "Id")
    private Artist artist;

    Album() {}

    public Album(String title){
        this.title = title;
        
    }

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

    public Artist getArtist(){
        return this.artist;
    }

    public void setArtist(Artist newArtist){
        this.artist = newArtist;
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
            if(this.title.equals(otherAlbum.title)){
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
        return String.format("Album (%s)", this.title);
    }
}
