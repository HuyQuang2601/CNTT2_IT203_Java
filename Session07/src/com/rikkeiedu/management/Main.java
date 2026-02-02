package com.rikkeiedu.management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Danh sách học sinh
    static ArrayList<Student> studentList = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    showAllStudents();
                    break;

                case 3:
                    calculateAverageScore();
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }
    // Hiển thị menu
    public static void showMenu() {
        System.out.println("===== QUẢN LÝ HỌC SINH =====");
        System.out.println("1. Thêm mới học sinh");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Tính điểm trung bình");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
    }
    // Thêm học sinh
    public static void addStudent() {

        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập lớp: ");
        String className = sc.nextLine();

        System.out.print("Nhập điểm: ");
        double score = Double.parseDouble(sc.nextLine());

        Student student = new Student(name, score, className);

        studentList.add(student);

        System.out.println("Thêm học sinh thành công!");
    }
    // Hiển thị danh sách
    public static void showAllStudents() {

        if (studentList.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.println("===== DANH SÁCH HỌC SINH =====");

        for (Student s : studentList) {
            s.displayInfo();
        }
    }
    // Tính điểm trung bình
    public static void calculateAverageScore() {

        if (studentList.isEmpty()) {
            System.out.println("Chưa có học sinh!");
            return;
        }

        double sum = 0;

        for (Student s : studentList) {
            sum += s.getScore();
        }

        double avg = sum / studentList.size();

        System.out.println("Điểm trung bình: " + avg);
    }
}
