package com.lab3;

public class Book extends Media {
    private int stock; // quantity in stock
    private Review[] review; // list of 100 reviews

    public Book(String title, String author, String ISBN, double price, int stock) {
        super(title, author, ISBN, price);
        this.stock = stock;
        review = new Review[200]; // assume max 200 reviews
    }

    public void addReview(Review r) {
        boolean wasAdded = false;
        if (r == null) {
            System.out.println("The review can not be empty");
        } else {
            for (int i = 0; i <= review.length - 1; i++) {
                if (review[i] == null) { // if the slot in the array is not occupied, then add the review to it
                    review[i] = r;
                    wasAdded = true;
                    break; // exit the loop, only add the review once
                }
            }
            if (wasAdded) {
                System.out.println("The Review was added successfully");
            } else {
                System.out.println("An error occurred while adding the review"); // no more slots in review list
            }
        }
    }

    public double getAverageRating() {
        int sum = 0;
        int totalReviews = 0;
        for (int i = 0; i <= review.length - 1; i++) {
            if (review[i] == null) { // no more reviews
                break;
            } else { // there are reviews
                sum += review[i].getRating();
                totalReviews++;
            }
        }
        if (totalReviews == 0) {
            return 0; // there are no reviews for this book
        } else {
            return (double) sum / totalReviews;
        }

    }

    public void purchase(User user) {
        boolean wasPurchased = false;
        if (user == null) {
            System.out.println("The user can not be empty");
        } else {
            Media[] userList = user.getPurchasedMediaList();
            for (int i = 0; i <= userList.length - 1; i++) {
                if (userList[i] == null) { // if the placeholder is not occupied, then add the media there.
                    userList[i] = this; // add this book
                    stock--; // decrement the stock quantity
                    wasPurchased = true;
                    break; // no need to add it multiple times, only once in an available slot.
                }
            }

            if (wasPurchased) {
                System.out.println("The "+getMediaType()+" was purchased successfully");
            } else {
                System.out.println("An error occurred while purchasing the "+getMediaType()); // no more slots in user list
            }
        }

    }

    public boolean isBestSeller() {
        if (getAverageRating() >= 4.5) {
            return true;
        } else {
            return false;
        }
    }

    public void restock(int quantity) {
        if (quantity <= 0) {
            System.out.println("Cant restock negative or zero times!");
        } else {
            stock += quantity;
            System.out.println("Restocked "+quantity+" books with title: "+getTitle());
            System.out.println("Total stock = "+stock);
        }
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
        if (getAverageRating() >= 4.5){
            return "Bestselling book";
        } else {
            return "Book";
        }
    }

    public String toString() {
        return "Media type: " + getMediaType() + ", stock: " + stock + ", " + super.toString();
    }

}
