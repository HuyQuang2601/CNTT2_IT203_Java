package Ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static ArrayList<Patient> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách");
            System.out.println("5. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addPatient();
                    break;

                case 2:
                    updateDiagnosis();
                    break;

                case 3:
                    removePatient();
                    break;

                case 4:
                    sortPatients();
                    break;

                case 5:
                    displayAll();
                    break;

                case 0:
                    System.out.println("Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }
    static void addPatient() {

        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        // Kiểm tra trùng ID
        if (findById(id) != null) {
            System.out.println("ID đã tồn tại!");
            return;
        }

        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        patients.add(new Patient(id, name, age, diagnosis));

        System.out.println("Thêm bệnh nhân thành công!");
    }

    static void updateDiagnosis() {

        System.out.print("Nhập ID cần sửa: ");
        String id = sc.nextLine();

        Patient p = findById(id);

        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân!");
            return;
        }

        System.out.print("Nhập chẩn đoán mới: ");
        String newDiagnosis = sc.nextLine();

        p.setDiagnosis(newDiagnosis);

        System.out.println("Cập nhật thành công!");
    }

    static void removePatient() {

        System.out.print("Nhập ID cần xóa: ");
        String id = sc.nextLine();

        Patient p = findById(id);

        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân!");
            return;
        }

        patients.remove(p);

        System.out.println("Xuất viện thành công!");
    }
    static void sortPatients() {

        if (patients.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        Collections.sort(patients, new Comparator<Patient>() {

            @Override
            public int compare(Patient o1, Patient o2) {

                // So sánh tuổi giảm dần
                if (o1.getAge() != o2.getAge()) {
                    return o2.getAge() - o1.getAge();
                }

                // Nếu tuổi bằng nhau → so sánh tên A-Z
                return o1.getFullName()
                        .compareToIgnoreCase(o2.getFullName());
            }
        });

        System.out.println("Sắp xếp thành công!");
    }
    static void displayAll() {

        if (patients.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (Patient p : patients) {
            p.display();
        }
    }
    static Patient findById(String id) {

        for (Patient p : patients) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }

        return null;
    }
}