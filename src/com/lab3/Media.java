package com.lab3;

public class Media {
    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Media(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        } else {
            System.out.println("Title can not be empty");
        }
    }

    public void setAuthor(String author) {
        if (author != null) {
            this.author = author;
        } else {
            System.out.println("Author can not be empty");
        }
    }

    public void setISBN(String ISBN) {
        if (ISBN != null) {
            this.ISBN = ISBN;
        } else {
            System.out.println("ISBN can not be empty");
        }
    }

    public void setPrice(double price) {
        if (price >= 0) { // can be free
            this.price = price;
        } else {
            System.out.println("Price can not be negative"); // give free money to customers
        }
    }

    public String getMediaType() {
        return "Media";
    }

    public String toString() {
        return "Media title: " + title + ", author: " + author + ", ISBN: " + ISBN + ", price: " + price;
    }

}
