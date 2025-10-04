public class Book extends LibraryItem {
    private String genre;
    private int pages;

    public Book(int id, String title, String author, String genre, int pages) {
        super(id, title, author);
        this.genre = genre;
        this.pages = pages;
    }

    @Override
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("[Book] ID: " + id + " | Title: " + title + " | Author: " + author +
                " | Genre: " + genre + " | Pages: " + pages +
                " | Available: " + (isAvailable ? "Yes" : "No"));
    }
}
