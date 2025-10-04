import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books; // Encapsulation
    private ArrayList<Student> students;

    public Library() {
        books = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.name);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.id == id) return book;
        }
        return null;
    }

    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.userId == id) return s;
        }
        return null;
    }

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID, Title, Author, Genre, Pages: ");
                    int id = sc.nextInt();
                    String title = sc.next();
                    String author = sc.next();
                    String genre = sc.next();
                    int pages = sc.nextInt();
                    addBook(new Book(id, title, author, genre, pages));
                }
                case 2 -> displayAllBooks();
                case 3 -> {
                    System.out.print("Enter Student ID and Book ID: ");
                    int sid = sc.nextInt();
                    int bid = sc.nextInt();
                    Student st = findStudentById(sid);
                    Book bk = findBookById(bid);
                    if (st != null && bk != null) st.borrowBook(bk);
                    else System.out.println("Invalid IDs.");
                }
                case 4 -> {
                    System.out.print("Enter Student ID and Book ID: ");
                    int sid = sc.nextInt();
                    int bid = sc.nextInt();
                    Student st = findStudentById(sid);
                    Book bk = findBookById(bid);
                    if (st != null && bk != null) st.returnBook(bk);
                    else System.out.println("Invalid IDs.");
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
