package com.lab3;

public class Novel extends Book {
    private String genre;

    public Novel(String title, String author, String ISBN, double price, int stock, Review[] review, String genre) {
        super(title, author, ISBN, price, stock, review);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        //TODO "Bestselling Novel" if Average Rating more than or
        //equal 4.5, else return "Novel".
    }

    @Override
    public String toString() {
        return "Media type: "+getMediaType()+", genre: "+genre+", "+super.toString();
    }
}
