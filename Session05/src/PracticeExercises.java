import java.util.Scanner;
import java.util.regex.Pattern;

public class PracticeExercises {
    static String[] mssvList = new String[100];
    static int count = 0;

    static final String MSSV_REGEX = "^B\\d{7}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            System.out.print("Chọn chức năng: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập số: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayList();
                    break;
                case 2:
                    addStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    searchStudent(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        scanner.close();
    }

    static void showMenu() {
        System.out.println("\n===== QUẢN LÝ MSSV =====");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm mới MSSV");
        System.out.println("3. Cập nhật MSSV theo index");
        System.out.println("4. Xóa MSSV");
        System.out.println("5. Tìm kiếm MSSV");
        System.out.println("0. Thoát");
    }
    // hiển thị
    static void displayList() {
        if (count == 0) {
            System.out.println("Danh sách MSSV đang rỗng!");
            return;
        }

        System.out.println("Danh sách MSSV:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + mssvList[i]);

        }
    }
    // thêm mới
    static void addStudent(Scanner scanner) {
        if (count >= 100) {
            System.out.println("Mảng đã đầy, không thể thêm!");
            return;
        }

        String mssv;
        do {
            System.out.print("Nhập MSSV mới: ");
            mssv = scanner.nextLine();
            if (!Pattern.matches(MSSV_REGEX, mssv)) {
                System.out.println("Sai định dạng! MSSV phải dạng Bxxxxxxx");
            }
        } while (!Pattern.matches(MSSV_REGEX, mssv));

        mssvList[count] = mssv;
        count++;
        System.out.println("Thêm MSSV thành công!");
    }
    //cập nhật
    static void updateStudent(Scanner scanner) {
        if (count == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.print("Nhập index cần sửa (1 - " + count + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 1 || index > count) {
            System.out.println("Index không hợp lệ!");
            return;
        }
        String newMSSV;
        do {
            System.out.print("Nhập MSSV mới: ");
            newMSSV = scanner.nextLine();
            if (!Pattern.matches(MSSV_REGEX, newMSSV)) {
                System.out.println("Sai định dạng MSSV!");
            }
        } while (!Pattern.matches(MSSV_REGEX, newMSSV));

        mssvList[index - 1] = newMSSV;
        System.out.println("Cập nhật thành công!");
    }
    // xóa
    static void deleteStudent(Scanner scanner) {
        if (count == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.print("Nhập MSSV cần xóa: ");
        String mssv = scanner.nextLine();
        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (mssvList[i].equalsIgnoreCase(mssv)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Không tìm thấy MSSV!");
            return;
        }

        for (int i = pos; i < count - 1; i++) {
            mssvList[i] = mssvList[i + 1];
        }
        mssvList[count - 1] = null;
        count--;

        System.out.println("Xóa MSSV thành công!");
    }
    // tìm kiếm
    static void searchStudent(Scanner scanner) {
        if (count == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.print("Nhập chuỗi cần tìm: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (mssvList[i].toLowerCase().contains(keyword)) {
                System.out.println((i + 1) + ". " + mssvList[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có MSSV nào phù hợp!");
        }
    }
}
