package com.lab3;

public class Novel extends Book {
    private String genre;

    public Novel(String title, String author, String ISBN, double price, int stock, String genre) {
        super(title, author, ISBN, price, stock);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre != null) {
            this.genre = genre;
        } else {
            System.out.println("Genre can not be empty");
        }
    }

    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5) {
            return "Bestselling Novel";
        } else {
            return "Novel";
        }
    }

    @Override
    public String toString() {
        return "Media type: " + getMediaType() + ", genre: " + genre + ", " + super.toString();
    }
}
