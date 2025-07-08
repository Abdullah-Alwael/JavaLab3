package com.lab3;

public class AcademicBook extends Book {
    private String subject;

    public AcademicBook(String title, String author, String ISBN, double price, int stock, String subject) {
        super(title, author, ISBN, price, stock);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject != null) {
            this.subject = subject;
        } else {
            System.out.println("Subject can not be empty");
        }
    }

    @Override
    public String getMediaType() {
        if (getAverageRating() >= 4.5) {
            return "Bestselling AcademicBook";
        } else {
            return "AcademicBook";
        }
    }

    @Override
    public String toString() {
        return "Media type: " + getMediaType() + ", subject: " + subject + ", " + super.toString();
    }
}
