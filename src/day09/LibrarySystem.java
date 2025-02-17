package day09;

public class LibrarySystem {
    public static void main(String[] args) {
        User librarian = new Librarian();
        User member =new Member();

        librarian.displayRole();
        member.displayRole();

        Library library=new OnlineLibrary();
        library.addBook();
        library.issueBook();
        library.returnBook();
    }
}
