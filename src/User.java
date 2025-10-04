public class User {
    protected int userId;
    protected String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("User ID: " + userId + " | Name: " + name);
    }
}
