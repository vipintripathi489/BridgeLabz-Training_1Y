class Book {

    private String bookTitle;
    private String author;
    private boolean isIssued;

    public Book(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isIssued = false;
    }

    public void displayBook() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + isIssued);
    }

    public void issueBook() {
        isIssued = true;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public String getBookTitle() {
        return bookTitle;
    }
}

class Member {

    private String memberName;
    private int memberId;

    public Member(String memberName, int memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public void displayMember() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
    }

    public String getMemberName() {
        return memberName;
    }
}

class Transaction {

    public void issueBook(Book book, Member member) {

        if (!book.isIssued()) {
            book.issueBook();
            System.out.println("Book '" + book.getBookTitle() +
                    "' issued to " + member.getMemberName());
        } else {
            System.out.println("Book is already issued!");
        }
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        // 1. Adding a new book
        Book book1 = new Book("Java Programming", "James Gosling");
        System.out.println("---- New Book Added ----");
        book1.displayBook();

        // 2. Registering a new member
        Member member1 = new Member("Anant", 101);
        System.out.println("\n---- New Member Registered ----");
        member1.displayMember();

        // 3. Issuing a book
        Transaction transaction = new Transaction();
        System.out.println("\n---- Issuing Book ----");
        transaction.issueBook(book1, member1);
    }
}