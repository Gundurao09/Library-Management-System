public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Preload some students and books
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");

        library.addStudent(s1);
        library.addStudent(s2);

        library.addBook(new Book(101, "Java101", "JamesG", "Programming", 300));
        library.addBook(new Book(102, "PythonPro", "Guido", "Programming", 250));

        library.showMenu();
    }
}
