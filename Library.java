import java.util.ArrayList;

public class Library {
    public ArrayList<Book> book;

    public Library(){
        this.book = new ArrayList<Book>();
    }

    public void addBook(Book book){
        this.book.add(book);
        System.out.println("Book added to library: "+ book.name);
    }

    public void borrowBook(Borrower borrower, Book book){
        this.book.remove(book);
        borrower.borrowBook(book);
    }

    public void returnBook(Borrower borrower, Book book) {
        this.book.add(book);
        borrower.returnBook(book);
    }

    public void displayLibraryBooks() {
        System.out.println("Books in Library: ");
        for(Book book : book){
            System.out.println("Title: "+book.name);
            System.out.println("ISBN: "+book.ISBN);
            System.out.println("Author: "+book.author.name);
            System.out.println("Biography: "+book.author.description);
        }
    }
}
