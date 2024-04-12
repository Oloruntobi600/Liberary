package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private List<Member>memberList;
    @BeforeEach
    public void setUpOne() {
        Library.membersList = new ArrayList<>();
        Library.membersList.add(new Member("Tobi", "Mokola", 001));
        Library.membersList.add(new Member("Tola", "Ibadan", 002));
        Library.membersList.add(new Member("Tosin", "Lagos", 003));
    }
    @Test
    void IWantToKnowIfAMemberHasBeenAddedInTheLibrary() {
        String nameToAdd = "Tobi";
        int memberIdToAdd = 001;
        Member member = new Member();
        Library library = new Library();
        library.addNewMember(member);
        assertEquals(memberIdToAdd, Library.membersList.get(0).getMemberId());
    }
    @Test
    void IWantToKnowIfAMemberHasNotBeenAddedInTheLibrary() {
        String nameToAdd = "Chuks";
        int memberIdToAdd = 006;
        Member member = new Member();
        Library library = new Library();
        library.addNewMember(member);
        assertNotEquals(memberIdToAdd, Library.membersList.get(0).getMemberId());
    }
    @BeforeEach
    public void setUpTwo() {
        Library.bookCollection = new ArrayList<>();
        Library.bookCollection.add(new Book("Nigeria", "Adeyinka", "SMS", 001, 5));
        Library.bookCollection.add(new Book("Egypt", "Olufela", "Art", 002, 3));
        Library.bookCollection.add(new Book("Lagos", "Gbenga", "ECN", 003, 6));
    }
    @Test
    void IWantToKnowIfABookHasBeenAddedInTheLibrary() {
        String bookTittleToAdd = "Nigeria";
        int isbnToAdd = 001;
        Book book = new Book();
        Library library = new Library();
        library.addNewBook(book);
        assertEquals(isbnToAdd, Library.bookCollection.get(0).getIsbn());
    }
    @Test
    void IWantToKnowIfABookHasNotBeenAddedInTheLibrary() {
        String bookTittleToAdd = "Ukraine";
        int isbnToAdd = 022;
        Book book = new Book();
        Library library = new Library();
        library.addNewBook(book);
        assertNotEquals(isbnToAdd, Library.bookCollection.get(0).getIsbn());
    }


}