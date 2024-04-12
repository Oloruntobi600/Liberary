package org.example;

import java.io.Serializable;

public class Book implements Serializable { // i am implementing serializable so indicate objects in this class can be serialized
    private String bookTittle;
    private String authorsName;
    private String memberId;
    private int isbn;
    private int availableCopies;

    public Book(String bookTittle, String authorsName,String memberId, int isbn, int availableCopies) { // my constructor
        this.bookTittle = bookTittle;
        this.authorsName = authorsName;
        this.memberId = memberId;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }
    public Book (){

    }

    public String getBookTittle() {
        return bookTittle;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTittle = bookTittle;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String member) {
        this.memberId = memberId;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTittle='" + bookTittle + '\'' +
                ", author='" + authorsName + '\'' +
                ", isbn=" + isbn +
                ", availableCopies=" + availableCopies +
                '}';
    }
}
