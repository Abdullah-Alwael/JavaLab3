package com.lab3;

public class Store {
    private User[] user;
    private Media[] media;

    public Store(User[] user, Media[] media) {
        this.user = user;
        this.media = media;
    }

    public User[] getUser() {
        return user;
    }

    public void setUser(User[] user) {
        this.user = user;
    }

    public Media[] getMedia() {
        return media;
    }

    public void setMedia(Media[] media) {
        this.media = media;
    }

    public void addUser(User user) {
        //TODO  Adds a user to the list of users.
    }

    public User[] displayUsers() {
        //TODO Displays a list of registered users.
    }

    public void addMedia(Media media) {
        //TODO  Adds a media to the list of medias
    }

    public Media[] displayMedias() {
        //TODO Displays a list of Available medias.
    }

    public Book searchBook(String title) {
        //TODO Searches for a book by title and returns it if found.
    }
}
