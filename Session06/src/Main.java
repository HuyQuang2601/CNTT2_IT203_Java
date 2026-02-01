public class Main {
    public static void main(String[] args) {
//Ex1
      Student s1 = new Student("SV01", "Nguyễn Văn A", 2004, 8.5);
      Student s2 = new Student("SV02", "Trần Thị B", 2005, 7.9);
// Ex2
        Account acc1 = new Account(
                "tricon06",
                "123456",
                "tricon@gmail.com"
        );
//Ex3
        Product p1 = new Product("SP01", "Laptop", 15000000);
//Ex4
        Employee e1 = new Employee();
        Employee e2 = new Employee("E01", "Nguyễn Văn A");
        Employee e3 = new Employee("E02", "Trần Thị B", 15000000);
//Ex5
        Book b1 = new Book(
                "B01",
                "Lập trình Java",
                "Nguyễn Văn A",
                95000
        );
//Ex6
        User u1 = new User(
                1,
                "tricon06",
                "123456",
                "tricon@gmail.com"
        );
        User u2 = new User(
                2,
                "user02",
                "abc123",
                "sai-email"
        );
        User u3 = new User(
                3,
                "user03",
                "",
                "user03@gmail.com"
        );
        // Gọi phương thức hiển thị thông tin
        s1.displayInfo();
        s2.displayInfo();

        acc1.displayInfo();
        acc1.changePassword("abc123456");
        acc1.displayInfo();

        p1.displayInfo();
        p1.setPrice(18000000);
        System.out.println("Sau khi đổi giá hợp lệ:");
        p1.displayInfo();
        p1.setPrice(-5000);
        System.out.println("Sau khi set giá không hợp lệ:");
        p1.displayInfo();

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();

        b1.displayInfo();

        System.out.println("User 1:");
        u1.displayInfo();
        System.out.println("User 2:");
        u2.displayInfo();
        System.out.println("User 3:");
        u3.displayInfo();
    }
}
