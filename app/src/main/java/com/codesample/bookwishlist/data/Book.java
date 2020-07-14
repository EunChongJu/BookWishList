package com.codesample.bookwishlist.data;

import android.graphics.Bitmap;

public class Book {
    private String id;          // (왜 있는지 모름)
    private String title;       // 책 제목(필수)
    private String content;     // 책 내용(선택)
    private int price;          // 가격(???)
    private String author;      // 저자(필수 아님)
    private String publisher;   // 출판사(선택)
    private Bitmap thumb;       // 책 표지의 이미지(선택)
    private String comment;     // 메모(선택: 이것을 왜 사야 하는가?)
    private int importance;     // 중요도(필수: 책의 중요도를 평가)
    private String created;     // 이 메모가 생성된 날짜(자동: "yy-mm-dd")
    private String modified;    // 이 메모가 수정된 날짜(자동: "yy-mm-dd")

    // 생성자
    public Book(String id, String title, String content, int price, String author, String publisher, Bitmap thumb, String comment, int importance) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
        this.thumb = thumb;
        this.comment = comment;
        this.importance = importance;
        this.created = created;
        this.modified = modified;
    }

    public Book() {

    }

    private Book book = new Book("1234", "My book", "???", 18000, "Who", "Titanic Books", null, "???", 4);

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
