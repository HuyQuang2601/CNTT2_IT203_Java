package Ex6;

import java.util.ArrayList;

public class UserManager {

    // Danh sách dùng chung cho toàn hệ thống
    public static ArrayList<User> users = new ArrayList<>();

    // Thêm user
    public static void addUser(User u) {
        users.add(u);
    }

    // Kiểm tra đăng nhập
    public static boolean checkLogin(String username, String password) {

        for (User u : users) {

            // So sánh username + password
            if (u.username.equals(username)
                    && u.password.equals(password)) {
                return true; // Đúng → đăng nhập thành công
            }
        }

        return false; // Không tìm thấy → thất bại
    }

    // Hiển thị danh sách user
    public static void showAllUsers() {

        int count = 1;

        for (User u : users) {
            System.out.println(count + ". " + u);
            count++;
        }
    }
}
