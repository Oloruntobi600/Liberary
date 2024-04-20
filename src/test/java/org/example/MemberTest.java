package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {
    @Test
    void testGetName() {
        Member member = new Member("Tobi", "Mokola", 001);
        assertEquals("Tobi", member.getName());
    }

    @Test
    void testSetName() {
        Member member = new Member();
        member.setName("Joshua");
        assertEquals("Joshua", member.getName());
    }

    @Test
    void testGetMemberId() {
        Member member = new Member("Tobi", "Mokola", 001);
        assertEquals(001, member.getMemberId());
    }

    @Test
    void testSetMemberId() {
        Member member = new Member();
        member.setMemberId(2);
        assertEquals(2, member.getMemberId());
    }

    @Test
    void testGetAddress() {
        Member member = new Member("Tobi", "Mokola", 001);
        assertEquals("Mokola", member.getAddress());
    }

    @Test
    void testSetAddress() {
        Member member = new Member();
        member.setAddress("Ilupeju");
        assertEquals("Ilupeju", member.getAddress());
    }


    @Test
    void testSetBorrowedBooks() {
        List<Book> borrowedBooks = new ArrayList<>();
        borrowedBooks.add(new Book("Nigeria", "Adeyinka", "SMS", 001, 5));
        borrowedBooks.add(new Book("Egypt", "Olufela", "Art", 002, 3));
        Member member = new Member();
        member.setBorrowedBooks(borrowedBooks);
        assertEquals(borrowedBooks, member.getBorrowedBooks());
    }

    @Test
    void testToString() {
        Member member = new Member("Tobi", "Mokola", 1);
        String expected = "Member{Name='Tobi', address='Mokola', memberId=1, borrowedBooks=[]}";
        assertEquals(expected, member.toString());
    }
}