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
                System.out.println("The "+getMediaType()+" has been watched successfully");
            } else {
                System.out.println("An error occurred while watching the "+getMediaType()); // no more slots in user list
            }
        }
    }
    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
        List<Movie> recommendations = new ArrayList<>();
        for (int i = 0; i <= movieCatalog.size()-1; i++) {
            if (movieCatalog.get(i).getAuthor().equals(this.getAuthor())){
                recommendations.add(movieCatalog.get(i));
            }
        }

        return recommendations;
    }

    @Override
    public String getMediaType(){
        if (duration >=120){
            return "Long Movie";
        } else {
            return "Movie";
        }
    }

    @Override
    public String toString() {
        return "Media type: "+getMediaType()+", duration: "+duration+", "+super.toString();
    }
}
