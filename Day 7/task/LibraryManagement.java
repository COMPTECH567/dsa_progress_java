class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Inherited class
class LibraryBook extends Book {
    boolean isIssued;

    LibraryBook(String title, String author) {
        super(title, author);
        isIssued = false;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued");
        } else {
            System.out.println("Already issued");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned");
        } else {
            System.out.println("Book was not issued");
        }
    }
}


public class LibraryManagement {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Harry Potter", "J.K. Rowling");

        b1.display();
        b1.issueBook();
        b1.returnBook();
    }
}