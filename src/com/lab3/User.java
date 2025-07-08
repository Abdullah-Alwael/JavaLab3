package com.lab3;

public class User {
    private String userName;
    private String email;
    private Media[] purchasedMediaList;
    private Media[] shoppingCart;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
        purchasedMediaList = new Media[500];
        shoppingCart = new Media[200];
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Media[] getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(Media[] purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public Media[] getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Media[] shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media media){
        //TODO Adds media to the user's shopping cart.
    }
    public void removeFromCart(Media media){
        //TODO  Removes media from the shopping cart.
    }

    public void checkOut(){
        //TODO Completes the purchase and updates purchased media list
        // {and} stock.
    }
}
