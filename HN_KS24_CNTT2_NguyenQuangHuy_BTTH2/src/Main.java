import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Student[] students;
    static int n = 0;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("==================================");
            System.out.print("Chọn chức năng: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    inputStudents();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    sortStudent();
                    System.out.println("Sắp xếp thành công!");
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }

    // Nhập danh sách sinh viên
    private static void inputStudents() {
        System.out.print("Nhập số lượng sinh viên: ");
        n = scanner.nextInt();
        scanner.nextLine();

        students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1));

            String id;
            while (true) {
                System.out.print("Mã SV (SVxxx): ");
                id = scanner.nextLine();
                if (id.matches("SV\\d{3}")) {
                    break;
                }
                System.out.println("Mã sinh viên không hợp lệ!");
            }

            System.out.print("Họ tên: ");
            String name = scanner.nextLine();

            System.out.print("Điểm trung bình: ");
            double score = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Student(id, name, score);
        }
    }

    // Hiển thị danh sách sinh viên
    private static void showStudents() {
        if (students == null || n == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Tìm kiếm sinh viên theo học lực
    private static void searchStudent() {
        System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
        String rank = scanner.nextLine();

        boolean found = false;
        for (Student s : students) {
            if (s.getRank().equalsIgnoreCase(rank)) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên phù hợp!");
        }
    }

    // Sắp xếp sinh viên theo học lực giảm dần
    private static void sortStudent() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}
