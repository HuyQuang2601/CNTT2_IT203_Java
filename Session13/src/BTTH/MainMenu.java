package BTTH;

import java.util.Scanner;

public class MainMenu {

    static Scanner sc = new Scanner(System.in);
    static PatientManager manager = new PatientManager();

    public static void main(String[] args) {

        int choice;

        do {

            displayMenu();

            choice = sc.nextInt();
            sc.nextLine();

            handleMenuSelection(choice);

        } while (choice != 0);

        System.out.println("Chương trình kết thúc!");
    }

    // Hiển thị menu
    public static void displayMenu() {

        System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
        System.out.println("1. Thêm bệnh nhân");
        System.out.println("2. Xóa bệnh nhân");
        System.out.println("3. Cập nhật bệnh nhân");
        System.out.println("4. Tìm kiếm theo tên");
        System.out.println("5. Hiển thị danh sách");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
    }

    // Xử lý lựa chọn
    public static void handleMenuSelection(int choice) {

        switch (choice) {

            case 1:
                addPatient();
                break;

            case 2:
                removePatient();
                break;

            case 3:
                updatePatient();
                break;

            case 4:
                searchPatient();
                break;

            case 5:
                manager.displayPatients();
                break;

            case 0:
                break;

            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    // ================= THÊM =================
    static void addPatient() {

        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập giới tính: ");
        String gender = sc.nextLine();

        System.out.print("Nhập bệnh lý: ");
        String disease = sc.nextLine();

        Patient p = new Patient(id, name, age, gender, disease);

        manager.addPatient(p);
    }

    // ================= XÓA =================
    static void removePatient() {

        System.out.print("Nhập ID cần xóa: ");
        String id = sc.nextLine();

        manager.removePatient(id);
    }

    // ================= CẬP NHẬT =================
    static void updatePatient() {

        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine();

        System.out.print("Tên mới: ");
        String name = sc.nextLine();

        System.out.print("Tuổi mới: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Giới tính mới: ");
        String gender = sc.nextLine();

        System.out.print("Bệnh lý mới: ");
        String disease = sc.nextLine();

        Patient p = new Patient(id, name, age, gender, disease);

        manager.updatePatient(id, p);
    }

    // ================= TÌM KIẾM =================
    static void searchPatient() {

        System.out.print("Nhập tên cần tìm: ");
        String name = sc.nextLine();

        manager.searchPatientByName(name);
    }
}
