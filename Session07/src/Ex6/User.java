package Ex6;

public class User {

    public final int id;
    public String username;
    public String password;

    public User(int id, String username, String password) {
        this.id = id; // Bắt buộc gán trong constructor
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User[id=" + id + ", name=" + username + "]";
    }
}

