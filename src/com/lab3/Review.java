package com.lab3;

public class Review {
    private String userName;
    private int rating; // max is assumed to be 5, and as low as 0
    private String comment;

    public Review(String userName, int rating, String comment) {
        this.userName = userName;
        this.rating = rating;
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName != null) {
            this.userName = userName;
        } else {
            System.out.println("Username can not be empty");
        }
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Rating can not be negative or out of range (0-5)");
        }
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        if (comment != null) {
            this.comment = comment;
        } else {
            System.out.println("Comment can not be empty");
        }
    }
}
