package com.lab3;

public class AcademicBook extends Book{
    private String subject;

    public AcademicBook(String title, String author, String ISBN, double price, int stock, String subject) {
        super(title, author, ISBN, price, stock);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        //TODO "Bestselling AcademicBook" if Average Rating more
        //than or equal 4.5, {else} return "AcademicBook".
    }

    @Override
    public String toString() {
        return "Media type: "+getMediaType()+", subject: "+subject+", "+super.toString();
    }
}
