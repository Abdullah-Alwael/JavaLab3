package com.lab3;

import java.util.ArrayList;
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

    public void watch(User user) {
        //TODO  Allows users to watch the movie by adding the movie to
        //the purchased list
        boolean wasWatched = false;
        if (user == null) {
            System.out.println("The user can not be empty");
        } else {
            Media[] userList = user.getPurchasedMediaList();
            for (int i = 0; i <= userList.length - 1; i++) {
                if (userList[i] == null) { // if the placeholder is not occupied, then add the media there.
                    userList[i] = this; // add this movie
                    wasWatched = true;
                    break; // no need to add it multiple times, only once in an available slot.
                }
            }

            if (wasWatched) {
                System.out.println("The movie has been watched successfully");
            } else {
                System.out.println("An error occurred while watching the movie"); // no more slots in user list
            }
        }
    }
    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
        //TODO  Recommends
        //similar movies based on the director (author).
        List<Movie> recommendations = new ArrayList<>();

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
