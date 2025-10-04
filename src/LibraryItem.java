public abstract class LibraryItem {
    protected int id;
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryItem(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Abstract methods → Abstraction
    public abstract void borrowItem();
    public abstract void returnItem();

    // Common method → Polymorphism via overriding
    public void displayInfo() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author +
                ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}
