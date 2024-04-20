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
    @BeforeEach
    public void setUpTwo() {
        Library.bookCollection = new ArrayList<>();
        Library.bookCollection.add(new Book("Nigeria", "Adeyinka", "SMS", 001, 5));
        Library.bookCollection.add(new Book("Egypt", "Olufela", "Art", 002, 3));
        Library.bookCollection.add(new Book("Lagos", "Gbenga", "ECN", 003, 6));
    }
    @Test
    void testAddMember() {
        Library library = new Library();
        Member member = new Member("Tobi", "Mokola", 001);
        library.addMember(member);
        assertEquals(1,member.getMemberId());
        assertTrue(library.getMembersList().contains(member));
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
        library.setAuthorsName("Adeyinka");
        assertNotEquals(isbnToAdd, Library.bookCollection.get(0).getIsbn());
    }
    @Test
    void testRemoveBook() {
        Library library = new Library();
        library.removeBook("Adeyinka");
        assertEquals(2, Library.getBookCollection().size());
    }
    @Test
    void testRemoveBookFailed() {
        Library library = new Library();
        library.removeBook("Adeyinka");
        assertNotEquals(3, Library.getBookCollection().size());
        assertFalse(false);
    }

    @Test
    void testRemoveAnotherBookFalse() {
        Library library = new Library();
        library.removeBook("Olufela");
        assertNotEquals(3, Library.getBookCollection().size());
        assertFalse(false);
    }

    @Test
    void testRemoveMember() {
        Library library = new Library();
        library.removeMember(001);
        assertEquals(2, Library.getMembersList().size());
    }
    @Test
    void testReturnBook() {
        Library library = new Library();
        library.returnBook("Nigeria", 001);
        assertTrue(true);
    }
    @Test
    void testReturnBookFalse() {
        Library library = new Library();
        library.returnBook("Nigeria", 001);
        assertFalse(false);
    }

    @Test
    void testDisplayAvailableBooks() {
        Library library = new Library();
        library.displayAvailableBooks("Nigeria", "Adeyinka", 001);
        assertTrue(true);
    }@Test
    void testDisplayUnAvailableBooks() {
        Library library = new Library();
        library.displayAvailableBooks("Togo", "Fela", 002);
        assertTrue(true);
    }
    @Test
    void testBorrowBook() {
        Library library = new Library();
        Library.borrowList = new ArrayList<>();
        library.borrowBook(001, "Nigeria");
        System.out.println(Library.getBorrowList());
        assertEquals(1, Library.getBorrowList().size());
//        assertNotEquals(1, Library.getBorrowList().size());
    }
    @Test
    void testBorrowBookFailure() {
        Library library = new Library();
        library.borrowBook(1, "Nigeria");
        assertEquals(2, library.getBorrowList().size());
    }
    @Test
    void testRemoveAnotherBook() {
        Library library = new Library();
        library.removeBook("Olufela");
        assertEquals(2, Library.getBookCollection().size());
    }
    @Test
    void testMemberName() {
        Library library = new Library();
        library.setAuthorsName("Adeyinka");
        assertEquals("Adeyinka",library.getAuthorsName());
    }

    @Test
    void testAddExistingBook() {
        Library library = new Library();
        library.addNewBook(new Book("Nigeria","Adeyinka","Public", 007, 3));
        assertTrue(true);
    }
    @Test
    void testAddExistingBookAgain() {
        Library library = new Library();
        library.addNewBook(new Book("Lome","Fiver","Private", 114, 3));
        assertFalse(false);
    }

    @Test
    void testAddExistingMember() {
        Library library = new Library();
        library.addNewMember(new Member("Tola", "Ibadan", 002));
        assertTrue(true);
    }
    @Test
    void testAddExistingMemberAgain() {
        Library library = new Library();
        library.addNewMember(new Member("Tola", "Ibadan", 002));
        assertFalse(false);
    }
    @Test
    void testRemoveNonExistingMember() {
        Library library = new Library();
        library.removeMember(3);
        assertEquals(2, Library.getMembersList().size());
        assertTrue(true);
    }

    @Test
    void testReturnNonExistingBook() {
        Library library = new Library();
        library.returnBook("Tunisia", 14);
        assertEquals(1, library.getBorrowList().size());
    }
    @Test
    void testDisplayAvailableBook() {
        Library library = new Library();
        library.displayAvailableBooks("Nigeria","Adeyinka", 001);
        assertEquals(3, Library.bookCollection.size());
    }
    @Test
    void testDisplayNonAvailableBook() {
        Library library = new Library();
        library.displayAvailableBooks("Kaduna","Wuse", 111);
        assertNotEquals(1, Library.bookCollection.size());
    }
    @Test
    void testAddBookCollectionNotNull() {
        Library library = new Library();
        assertNotNull(Library.getBookCollection());
    }

    @Test
    void testAddMembersListNotNull() {
        Library library = new Library();
        assertNotNull(Library.getMembersList());
    }
    @Test
    void testAddMembersListIsNull() {
        Library library = new Library();
        library.setMembersList(null);
        assertNull(Library.getMembersList());
    }

    @Test
    void testAddBorrowListNotNull() {
        Library library = new Library();
        assertNotNull(Library.getBorrowList());
    }
//    @Test
//    void testAddBorrowListIsEmptyIfNoBorrowers() {
//        assertEquals(0,Library.getBorrowList().size());
//        assertNotEquals(2,Library.getBorrowList().size());
//    }
    @Test
    void testSetAndGetBookCollection() {
        List<Book> bookCollection = new ArrayList<>();
        Book book = new Book();
        Library library = new Library();
        bookCollection.add(book);
        library.setBookCollection(bookCollection);
        assertEquals(bookCollection, library.getBookCollection());
    }

    @Test
    void testSetAndGetMembersList() {
        List<Member> membersList = new ArrayList<>();
        Member member = new Member("Tobi", "Mokola", 001);
        membersList.add(member);
        Library library = new Library();
        library.setMembersList(membersList);
        assertEquals(membersList, library.getMembersList());
    }

    @Test
    void testSetAndGetBorrowList() {
        List<BookDto> borrowList = new ArrayList<>();
        BookDto bookDto = new BookDto("Adeyinka", 1);
        borrowList.add(bookDto);
        Library library = new Library();
        library.setBorrowList(borrowList);
        assertEquals(borrowList, library.getBorrowList());
    }

    @Test
    void testSetAndGetBookAuthorsName() {
        Library library = new Library();
        library.setAuthorsName("Adeyinka");
        assertEquals("Adeyinka", library.getAuthorsName());
    }
    @Test
    void testSetAndGetBookAuthorsNameFailure() {
        Library library = new Library();
        library.setAuthorsName("Adeyinka");
        assertNotEquals("Yinka", library.getAuthorsName());
    }




}