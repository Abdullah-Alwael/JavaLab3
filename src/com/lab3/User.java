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

    public void addToCart(Media media) {
        boolean wasAdded = false;
        if (media == null) {
            System.out.println("The media can not be empty");
        } else {
            for (int i = 0; i <= shoppingCart.length - 1; i++) {
                if (shoppingCart[i] == null) { // if the slot in the array is not occupied, then add the media to it
                    shoppingCart[i] = media;
                    wasAdded = true;
                    break; // exit the loop, only add the media once
                }
            }
            if (wasAdded) {
                System.out.println("The media was added to cart successfully");
            } else {
                System.out.println("An error occurred while adding the media to cart"); // no more slots in cart list
            }
        }
    }

    public void removeFromCart(Media media) {
        boolean wasRemoved = false;
        if (media == null) {
            System.out.println("The media can not be empty");
        } else {
            for (int i = 0; i <= shoppingCart.length - 1; i++) {
                if (shoppingCart[i].equals(media)) {
                    for (int j = i; j < shoppingCart.length - 1; j++) { // move other items to the front of cart
                        if (shoppingCart[j] == null) {
                            break; //reached end of cart, if not full
                        } else {
                            shoppingCart[j] = shoppingCart[j + 1]; // j+1, that is why (j < length-1)
                            // and not (j<= length-1)
                        }
                    }
                    // in case the shopping cart was full, the last two items will become the same due to swapping
                    // hence remove last item:
                    shoppingCart[shoppingCart.length - 1] = null;
                    wasRemoved = true;
                    break; // no need to check further medias in the cart
                }
            }
            if (wasRemoved) {
                System.out.println("The media was removed from cart successfully");
            } else {
                System.out.println("An error occurred while removing the media from cart"); // the media does not exist
            }
        }
    }

    public void checkOut() {
        // because there is no way of knowing that the purchase was completed successfully in the program (yet)
        // (example out of array storage), the shopping cart items not added to purchased list will be lost.
        // all items in the cart will be removed after calling this method

        double totalPrice = 0; // to print the total price of purchased items

        while (shoppingCart[0] != null) {
            totalPrice += shoppingCart[0].getPrice(); // the list is shifted using the removeFromCart() method.

            // purchase using the methods in the corresponding class
            // and it will update the stock of books
            if (shoppingCart[0].getClass() == Book.class
                    || shoppingCart[0].getClass() == Novel.class
                    || shoppingCart[0].getClass() == AcademicBook.class) {
                ((Book) shoppingCart[0]).purchase(this);
            } else if (shoppingCart[0].getClass() == Movie.class) {
                ((Movie) shoppingCart[0]).watch(this);
            } else { // it's definitely music
                ((Music) shoppingCart[0]).listen(this);
            }

            removeFromCart(shoppingCart[0]);
        }

        System.out.println("Cart checkout. Purchase completed with a total price of " + totalPrice);
    }
}
