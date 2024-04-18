package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    void testGetBookTittle() {
        Book book = new Book("Nigeria", "Adeyinka", "SMS", 001, 5);
        assertEquals("Nigeria", book.getBookTittle());
    }

    @Test
    void testGetAuthorsName() {
        Book book = new Book("Nigeria", "Adeyinka", "SMS", 001, 5);
        assertEquals("Adeyinka", book.getAuthorsName());
    }

    @Test
    void testGetIsbn() {
        Book book = new Book("Nigeria", "Adeyinka", "SMS", 001, 5);
        assertEquals(001, book.getIsbn());
    }

    @Test
    void testGetMemberId() {
        Book book = new Book("Nigeria", "Adeyinka", "SMS", 001, 5);
        assertEquals("SMS", book.getMemberId());
    }

    @Test
    void testGetAvailableCopies() {
        Book book = new Book("Nigeria", "Adeyinka", "SMS", 001, 5);
        assertEquals(5, book.getAvailableCopies());
    }

    @Test
    void testSetBookTittle() {
        Book book = new Book();
        book.setBookTittle("Nigeria");
        assertEquals("Nigeria", book.getBookTittle());
    }

    @Test
    void testSetAuthorsName() {
        Book book = new Book();
        book.setAuthorsName("Adeyinka");
        assertEquals("Adeyinka", book.getAuthorsName());
    }

    @Test
    void testSetIsbn() {
        Book book = new Book();
        book.setIsbn(001);
        assertEquals(001, book.getIsbn());
    }

    @Test
    void testSetMemberId() {
        Book book = new Book();
        book.setMemberId("Tunisia");
        assertEquals("Tunisia", book.getMemberId());
    }

    @Test
    void testSetAvailableCopies() {
        Book book = new Book();
        book.setAvailableCopies(10);
        assertEquals(10, book.getAvailableCopies());
    }

    @Test
    void testToString() {
        Book book = new Book("Nigeria", "Adeyinka", "SMS", 1, 5);
        String expected = "Book{bookTittle='Nigeria', author='Adeyinka', isbn=1, availableCopies=5}";
        assertEquals(expected, book.toString());
    }

}