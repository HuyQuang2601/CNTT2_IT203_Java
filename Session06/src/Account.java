public class Account {
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Đổi mật khẩu thành công!");
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("---------------------");
    }

    // PHẢI CÓ MAIN
    public static void main(String[] args) {
        Account acc = new Account(
                "huy123",
                "123456",
                "huy@gmail.com"
        );

        acc.displayInfo();
        acc.changePassword("newpass123");
        acc.displayInfo();
    }
}
