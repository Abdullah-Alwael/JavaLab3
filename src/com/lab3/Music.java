package com.lab3;

import java.util.List;

public class Music extends Media{
    private String artist;

    public Music(String title, String author, String ISBN, double price, String artist) {
        super(title, author, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user){
        //TODO  Allows users to listen to music.
    }

    public List<Music> generatePlaylist(List<Music>){
        //TODO Generates a playlist of
        //similar songs based on the artist (auteur).
    }

    @Override
    public String getMediaType() {
        //TODO  return "Premium Music" if the price more than
        //or equal 10, else return "Music".
    }

    @Override
    public String toString() {
        return "Media type: "+getMediaType()+", artist: "+artist+", "+super.toString();
    }
}
