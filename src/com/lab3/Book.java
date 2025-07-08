package com.lab3;

public class Book extends Media{
    private int stock; // quantity in stock
    private Review[] review; // list of 100 reviews

    public Book(String title, String author, String ISBN, double price, int stock) {
        super(title, author, ISBN, price);
        this.stock = stock;
        review = new Review[200];
    }

    public void addReview(Review r){
        //TODO adds review to the book's list
    }
    public double getAverageRating(){
        //TODO Calculates and returns the average rating.
    }
    public void purchase(User user){
        //TODO Allows users to add the book to the purchased list and
        //decrease book stock by 1.
    }
    public boolean isBestSeller(){
        //TODO This method checks if a book is a bestseller based on criteria
        //such as if its average rating more than or equal 4.5.
    }
    public void restock(int quantity){
        //TODO This method allows for restocking a book by
        //increasing its quantity in stock. It also prints a message to inform about the
        //restocking.
    }

    public int getStock() {
        return stock;
    }

    public Review[] getReview() {
        return review;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setReview(Review[] review) {
        this.review = review;
    }

    @Override
    public String getMediaType() {
        //TODO return "Bestselling Book" if Average Rating more
        //than or equel 4.5, else return "Book".
    }
    public String toString(){
        return "Media type: "+getMediaType()+", stock: "+stock+", "+super.toString();
    }

}
