package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    public static List<Book> bookCollection =new ArrayList<>();
    public static  List<Member> membersList = new ArrayList<>();
    public static List<BookDto> borrowList = new ArrayList<>(); // data transfer objects
    public static String authorsName;

//        public Library(List<Book> bookCollection, List<Member> membersList, String authorsName) {
//        this.bookCollection = bookCollection;
//        this.membersList = membersList;
//        this.authorsName = authorsName;
//}

    public Library(List<Book>bookCollection,List<Member>membersList,List<BookDto>borrowList, String authorsName) {
        bookCollection = new ArrayList<>();
        membersList = new ArrayList<>();
        borrowList = new ArrayList<>();
        Library.authorsName = authorsName;
    }
    public Library(){

    }

//    public void addBook(Book book) {   // method to add a book
//        bookCollection.add(book);
//    }

    public void addMember(Member member) { //method to add a member
        membersList.add(member);
    }
    public void addNewMember(Member member) {
        if (membersList.contains(member)) { // Check if the book is not already in the collection
            membersList.add(member);
            System.out.println("Member added successfully.");
        } else {
            System.out.println("Member already exists in the library.");
        }
    }
    public void getAvailableBookList(List<Book>bookCollection){
        for (int i = 0; i<bookCollection.size(); i++){
            System.out.println(bookCollection.get(i));
        }
    }
    public void getAvailableMemberList(List<Member>membersList) {
        for (int i = 0; i<membersList.size(); i++){
            System.out.println(membersList.get(i));
        }
    }


    public void addNewBook(Book book) {
        if (bookCollection.contains(book)) { // Check if the book is not already in the collection
            bookCollection.add(book);
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Book already exists in the library.");
        }
    }
    public void removeBook(String authorsName) { // method of removing a member from the list of members
        for (int i = 0; i < bookCollection.size(); i++) {
            if (bookCollection.get(i).getAuthorsName().equals(authorsName)) {
                bookCollection.remove(bookCollection.get(i));
                System.out.println("members with id " + authorsName + " has been removed from the list");
            }
        }

    }


    public void removeMember(int memberId) { // method of removing a member from the list of members
        for (int i = 0; i < membersList.size(); i++) {
            if (membersList.get(i).getMemberId() == memberId) {
                membersList.remove(membersList.get(i));
                System.out.println("members with id " + memberId + " has been removed from the list");
            }
        }

    }

    public void returnBook(String bookTittle, int memberId) { // method of returning a book to the library
        for (int i = 0; i < bookCollection.size(); i++) {
            if (bookCollection.get(i).getBookTittle().equals(bookTittle) && membersList.get(i).getMemberId() == memberId) {
            }
        }
    }

    public void displayAvailableBooks(String bookTittle, String authorName, int isbn) { // method to display available books 
        for (int i = 0; i < bookCollection.size(); i++) {
            if (bookCollection.get(i).getBookTittle().equals(bookTittle) && bookCollection.get(i).getAuthorsName().equals(authorName)
                    && bookCollection.get(i).getIsbn() == isbn) {
                System.out.println("Available books " + bookTittle + ", authors name " + authorName + "with isbn number " + isbn);
            }
        }
    }

    public void borrowBook(int memberId, String bookTittle) { // method to borrow books from the library and i have used
        for (int i = 0; i < bookCollection.size(); i++) {
           if (bookCollection.get(i).getBookTittle().equals(bookTittle)) {
               BookDto book = new BookDto(bookTittle,memberId);
               borrowList.add(book);
           }
        }
    }

//    public List<Book> getCollection() {
//        return collection;
//    }
//
//    public void setCollection(List<Book> collection) {
//        this.collection = collection;
//    }

//    public List<Member> getMembersList() {
//        return membersList;
//    }
//
//    public void setMembers(List<Member> membersList) {
//        this.membersList = membersList;
//    }

    public String getAuthorsName() {
        return authorsName;
    }


    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public static List<Book> getBookCollection() {
        return bookCollection;
    }


    public static void setBookCollection(List<Book> bookCollection) {
        Library.bookCollection = bookCollection;
    }

    public static List<Member> getMembersList() {
        return membersList;
    }

    public static void setMembersList(List<Member> membersList) {
        Library.membersList = membersList;
    }

    public static List<BookDto> getBorrowList() {
        return borrowList;
    }

    public static void setBorrowList(List<BookDto> borrowList) {
        Library.borrowList = borrowList;
    }

    @Override
    public String toString() {
        return "Library{" +
                "authorsName='" + authorsName + '\'' +
                '}';
    }
}
