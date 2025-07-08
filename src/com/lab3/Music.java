package com.lab3;

import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private String artist;

    public Music(String title, String author, double price, String artist) {
        super(title, author, "Music", price); // no ISBN for music items
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user){
        boolean wasListened = false;
        if (user == null) {
            System.out.println("The user can not be empty");
        } else {
            Media[] userList = user.getPurchasedMediaList();
            for (int i = 0; i <= userList.length - 1; i++) {
                if (userList[i] == null) { // if the placeholder is not occupied, then add the media there.
                    userList[i] = this; // add this music
                    wasListened = true;
                    break; // no need to add it multiple times, only once in an available slot.
                }
            }

            if (wasListened) {
                System.out.println("The music has been listened to successfully");
            } else {
                System.out.println("An error occurred while listening to the music"); // no more slots in user list
            }
        }

    }

    public List<Music> generatePlaylist(List<Music> musicCatalog){
        List<Music> recommendations = new ArrayList<>();
        for (int i = 0; i <= musicCatalog.size()-1; i++) {
            if (musicCatalog.get(i).getArtist().equals(this.getArtist())){
                recommendations.add(musicCatalog.get(i));
            }
        }

        return recommendations;
    }

    @Override
    public String getMediaType() {
        if (getPrice() >=10){
            return "Premium Music";
        } else {
            return "Music";
        }
    }

    @Override
    public String toString() {
        return "Media type: "+getMediaType()+", artist: "+artist+", "+super.toString();
    }
}
