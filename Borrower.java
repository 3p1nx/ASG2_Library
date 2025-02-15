
import java.util.ArrayList;

public class Borrower {

    public String name;
    public ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
        System.out.println(this.name + " borrowed: " + book.name);
    }

    public void returnBook(Book book){
        borrowedBooks.remove(book);
        System.out.println(this.name +" returned " + book.name);
    }

    public void displayBorrowedBooks() {

       System.out.println(this.name + " Borrowed books : ");
       for(Book book:borrowedBooks){
        System.out.println("Title: "+book.name);
        System.out.println("ISBN: "+book.ISBN);
        System.out.println("Author: "+book.author.name);
        System.out.println("Biography: "+book.author.description);
        System.out.println("------------------------------------");
       }
    }

}
