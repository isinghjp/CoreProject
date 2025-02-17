package day09;

public class OnlineLibrary implements Library{

    @Override
    public void addBook() {
        System.out.println("Adding a book to the library.");
    }

    @Override
    public void issueBook() {
        System.out.println("Issuing a book to a member.");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning a book to the library.");
    }
}
