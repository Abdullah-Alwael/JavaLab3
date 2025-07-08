package com.lab3;

public class Store {
    private User[] users;
    private Media[] medias;

    public Store() {
        users = new User[500]; // 500 max users
        medias = new Media[1000]; //1000 max media
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Media[] getMedias() {
        return medias;
    }

    public void setMedias(Media[] medias) {
        this.medias = medias;
    }

    public void addUser(User user) {
        boolean wasAdded = false;
        if (user == null) {
            System.out.println("The user can not be empty");
        } else {
            for (int i = 0; i <= users.length - 1; i++) {
                if (users[i] == null) { // if the slot in the array is not occupied, then add the user to it
                    users[i] = user;
                    wasAdded = true;
                    break; // exit the loop, only add the user once
                }
            }
            if (wasAdded) {
                System.out.println("The user was added successfully");
            } else {
                System.out.println("An error occurred while adding the user"); // no more slots in user list
            }
        }
    }

    public User[] displayUsers() {
        //TODO Displays a list of registered users.
        for (int i = 0; i <= users.length - 1; i++) {
            if (users[i] == null) {
                break; // reached final user
            } else {
                System.out.println("User " + i + ": " + users[i]);
            }
        }
        return users; // displaying involves output, maybe unnecessary to return the list? since we also have getUsers()
    }

    public void addMedia(Media media) {
        //TODO  Adds a media to the list of medias
        boolean wasAdded = false;
        if (media == null) {
            System.out.println("The media can not be empty");
        } else {
            for (int i = 0; i <= medias.length - 1; i++) {
                if (medias[i] == null) { // if the slot in the array is not occupied, then add the media to it
                    medias[i] = media;
                    wasAdded = true;
                    break; // exit the loop, only add the media once
                }
            }
            if (wasAdded) {
                System.out.println("The media was added successfully");
            } else {
                System.out.println("An error occurred while adding the media"); // no more slots in media list
            }
        }
    }

    public Media[] displayMedias() {
        //TODO Displays a list of Available medias.
    }

    public Book searchBook(String title) {
        //TODO Searches for a book by title and returns it if found.
    }
}
