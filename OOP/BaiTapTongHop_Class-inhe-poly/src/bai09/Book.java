package bai09;

import bai05.Person;

public class Book extends Publication {
    private String author;
    public Book() {}
    public Book(String title, double price, String author) {
        super(title,price);
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Author: " + author);
    }
}
