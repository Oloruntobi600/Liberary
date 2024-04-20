package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String Name;
    private String address;
    private int memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String address, int memberId) {
        Name = name;
        this.address = address;
        this.memberId = memberId;
        borrowedBooks = new ArrayList<>();
    }
    public  Member(){

    }
    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "Member{" +
                "Name='" + Name + '\'' +
                ", address='" + address + '\'' +
                ", memberId=" + memberId +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
