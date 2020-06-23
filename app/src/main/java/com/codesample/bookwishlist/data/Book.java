package com.codesample.bookwishlist.data;

public class Book {
    public String id;   // ISBN ID
    public String title;
    public String content;
    public String author;
    public int price;
    public String publisher;

    public Book(String id, String title, String content, String author, int price, String publisher) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }
}
