package day09.com.library;

// Encapsulation Example
class Book {
    private String title;
    private String author;
    private int bookID;

    public Book(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookID() {
        return bookID;
    }
}

// Inheritance Example
class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void login() {
        System.out.println("User logged in: " + name);
    }
}

class Librarian extends User {
    public Librarian(String name, String email) {
        super(name, email);
    }

    public void manageBooks() {
        System.out.println("Librarian " + name + " is managing books.");
    }
}

class Member extends User {
    public Member(String name, String email) {
        super(name, email);
    }

    public void borrowBook() {
        System.out.println("Member " + name + " borrowed a book.");
    }
}

// Abstraction Example
interface Library {
    void addBook(Book book);
    void issueBook(int bookID);
    void returnBook(int bookID);
}

class OnlineLibrary implements Library {
    @Override
    public void addBook(Book book) {
        System.out.println("Added book: " + book.getTitle());
    }

    @Override
    public void issueBook(int bookID) {
        System.out.println("Issued book with ID: " + bookID);
    }

    @Override
    public void returnBook(int bookID) {
        System.out.println("Returned book with ID: " + bookID);
    }
}

// Main Class
public class LibraryManagement {
    public static void main(String[] args) {
        // Encapsulation Example
        Book book = new Book("Java Programming", "Jay Prakash Singh", 101);

        // Inheritance Example
        Librarian librarian = new Librarian("Amar", "amar@library.com");
        librarian.manageBooks();

        Member member = new Member("Pratiksha", "pratiksha@library.com");
        member.borrowBook();

        // Abstraction Example
        Library library = new OnlineLibrary();
        library.addBook(book);
        library.issueBook(101);
        library.returnBook(101);
    }
}
