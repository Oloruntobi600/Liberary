package org.example;

import java.util.PriorityQueue;
import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Nigeria", "Adeyinka", "SMS", 001, 5);
        Book book2 = new Book("Egypt", "Olufela", "Art", 002, 3);
        Book book3 = new Book("Lagos", "Gbenga", "ECN", 003, 6);
        Book book4 = new Book("Lagos", "Sola", "ECN", 003, 6);

        Library.bookCollection.add(book1);
        Library.bookCollection.add(book2);
        Library.bookCollection.add(book3);
        System.out.println("Book collection: \n" + Library.bookCollection);
        System.out.println(" 1.Testing Adding of Book to the Library");
        System.out.println("Book: " + book1.getBookTittle() + " has been added to the Library");
        System.out.println("Book: " + book2.getBookTittle() + " has been added to the Library");
        System.out.println("Book: " + book3.getBookTittle() + " has been added to the Library");


        System.out.println("2. Testing returning book to the Library");
        System.out.println("Book: " + book1.getBookTittle() + " with MemberId " + book1.getMemberId() + " has been returned ");
        System.out.println("Book: " + book2.getBookTittle() + " with MemberId " + book2.getMemberId() + " has been returned ");
        System.out.println("Book: " + book3.getBookTittle() + " with MemberId " + book3.getMemberId() + " has been returned ");


        Library library1 = new Library(Library.bookCollection, Library.membersList, Library.getBorrowList(), "Adeyinka");
        Library library2 = new Library(Library.bookCollection, Library.membersList,Library.getBorrowList(), "Olufela");
        Library library3 = new Library(Library.bookCollection, Library.membersList, Library.getBorrowList(), "Gbenga");

        System.out.println( " 3. Testing to check books in the library");
        library1.addNewBook(book1);
        library2.addNewBook(book2);
        library3.addNewBook(book3);
        library3.addNewBook(book4);

        library1.removeBook("Adeyinka");
        library1.removeBook("Olufela");
        library1.removeBook("Gbenga");
        System.out.println(" 4. Testing to remove book from the library ");
        System.out.println(" Authors Name: " +book1.getAuthorsName() + " has been removed");
        System.out.println(" Authors Name: " +book2.getAuthorsName() + " has been removed");
//        System.out.println(" Authors Name: " +book3.getAuthorsName() + " has been removed");

        System.out.println("5. Testing how to check available books left");
        library1.getAvailableBookList(Library.getBookCollection());



        System.out.println(" 6. Testing how to Display available books in the Library");
        System.out.println("Book Tittle :" +book1.getBookTittle() + " with Authors name " + book1.getAuthorsName() + " and ISBN "
        + book1.getIsbn() + " is available in the library");
        System.out.println("Book Tittle :" +book2.getBookTittle() + " with Authors name " + book2.getAuthorsName() + " and ISBN "
                + book2.getIsbn() + " is available in the library");
        System.out.println("Book Tittle :" +book3.getBookTittle() + " with Authors name " + book3.getAuthorsName() + " and ISBN "
                + book3.getIsbn() + " is available in the library");




        Member member1 = new Member("Tobi", "Mokola", 001);
        Member member2 = new Member("Tola", "Ibadan", 002);
        Member member3 = new Member("Tosin", "Lagos", 003);
        Member member4 = new Member("Tosin", "Lagos", 003);

//        System.out.println("5. Testing how to check available books left");
//        library1.getAvailableBookList(Library.getBookCollection());



        library1.addMember(member1);
        library2.addMember(member2);
        library3.addMember(member3);
        System.out.println("Member list: \n" + Library.membersList);
        System.out.println(" 7.Testing to Register Members in the Library");
        System.out.println("Member name: " +member1.getName() + " with memberId  " + member1.getMemberId() + " has been added "  );
        System.out.println("Member name: " +member2.getName() + " with memberId  " + member2.getMemberId() + " has been added "  );
        System.out.println("Member name: " +member3.getName() + " with memberId  " + member3.getMemberId() + " has been added "  );

        System.out.println( " 8. Testing to check members in the library");
        library1.addNewMember(member1);
        library2.addNewMember(member2);
        library3.addNewMember(member3);
        library3.addNewMember(member4);



        library1.removeMember(member1.getMemberId());
        library2.removeMember(member2.getMemberId());
        library3.removeMember(member3.getMemberId());
        System.out.println(" 9. Testing to remove member from the library ");
        System.out.println(" MemberId: " +member1.getMemberId() + " has been removed");
        System.out.println(" MemberId: " +member2.getMemberId() + " has been removed");
//        System.out.println(" MemberId: " +member3.getMemberId() + " has been removed");

        System.out.println("10. Testing how to check available members left");
        library1.getAvailableMemberList(Library.getMembersList());



        MembershipLevel membershipLevel1 = new MembershipLevel(50, "Tobi", "Gold", 100, 12-2-2024);
        MembershipLevel membershipLevel2 = new MembershipLevel(60, "Tola", "Silver", 90, 12-3-2021);
        MembershipLevel membershipLevel3 = new MembershipLevel(30, "Tosin", "Bronze", 50, 12-5-2022);

        Queue<MembershipLevel> membershipLevels = new PriorityQueue<>();
        membershipLevels.add(new MembershipLevel(002, "Tobi", "Gold", 100, 2024));
        membershipLevels.add(new MembershipLevel(003, "Tola", "Silver", 90, 2021));
        membershipLevels.add(new MembershipLevel(004, "Tosin", "Bronze", 50, 2022));

        System.out.println(" 11. Method for priority waiting list");
        System.out.println(membershipLevels);
        System.out.println(membershipLevels.poll());
        System.out.println(membershipLevels);


        library1.borrowBook(001, "Nigeria");
        library1.borrowBook(002, "Egypt");
        library1.borrowBook(003, "America");
        System.out.println( " 12. Method to borrow books to the library");
        System.out.println(Library.borrowList);
    }
}


