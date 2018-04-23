package com.example.mehrabpatwary.booksstorage;

import android.widget.TextView;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private int image;
    private String bookName;
    private String bookWritter;
    private String bookPrice;

    public Book(int image, String bookName, String bookWritter, String bookPrice) {
        this.image = image;
        this.bookName = bookName;
        this.bookWritter = bookWritter;
        this.bookPrice = bookPrice;
    }

    public Book() {
    }

    public int getImage() {
        return image;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookWritter() {
        return bookWritter;
    }

    public String getBookPrice() {
        return bookPrice;
    }
    public List<Book>generateBookList(){
        List<Book>books=new ArrayList<>();
        books.add(new Book(R.drawable.book,"Bangladesh Economy","Mohsin Patwary","100"));
        books.add(new Book(R.drawable.book,"Bangladesh Economy","Mohsin Patwary","100"));
        return books;
    }
}
