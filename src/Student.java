import java.util.ArrayList;

public class Student extends User {
    private ArrayList<Book> borrowedBooks;

    public Student(int userId, String name) {
        super(userId, name);
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book != null && book.isAvailable) {
            borrowedBooks.add(book);
            book.borrowItem();
        } else {
            System.out.println("Book not available to borrow.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnItem();
        } else {
            System.out.println("You didn’t borrow this book.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + userId + " | Name: " + name +
                " | Borrowed Books: " + borrowedBooks.size());
    }
}
