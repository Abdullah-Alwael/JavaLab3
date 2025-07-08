package com.lab3;

import java.util.List;

public class Movie extends Media {
    private int duration; // in minutes

    public Movie(String title, String author, double price, int duration) {
        super(title, author, "Movie", price); // no ISBN for movies
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user){
        //TODO  Allows users to watch the movie by adding the movie to
        //the purchased list
    }
    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
        //TODO  Recommends
        //similar movies based on the director (author).
    }

    @Override
    public String getMediaType(){
        //TODO return "Long Movie" if duration more than or
        //equel 120, else return "Movie".
    }

    @Override
    public String toString() {
        return "Media type: "+getMediaType()+", duration: "+duration+", "+super.toString();
    }
}
