package org.example;

public class BookDto {
    private String bookTittle;
    private int memberId;

    public BookDto(String bookTittle, int memberId) {
        this.bookTittle = bookTittle;
        this.memberId = memberId;
    }

    public String getBookTittle() {
        return bookTittle;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTittle = bookTittle;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "bookTittle='" + bookTittle + '\'' +
                ", memberId=" + memberId +
                '}';
    }
}
