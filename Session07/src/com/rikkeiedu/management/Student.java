package com.rikkeiedu.management;

public class Student {

    // Tên trường (hằng số)
    public static final String SCHOOL_NAME = "Rikkei Academy";

    // Biến static để auto-increment ID
    private static int autoId = 1;
    // ID không được thay đổi
    private final int id;

    private String fullName;
    private double score;
    private String className;

    // Constructor
    public Student(String fullName, double score, String className) {
        this.id = autoId++; // Tự tăng ID
        this.fullName = fullName;
        this.score = score;
        this.className = className;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public double getScore() {
        return score;
    }

    public String getClassName() {
        return className;
    }

    // Hiển thị thông tin
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Lớp: " + className);
        System.out.println("Điểm: " + score);
        System.out.println("Trường: " + SCHOOL_NAME);
        System.out.println("----------------------");
    }
}
