package Ex1;

public class Student {
    private String studentId;
    private String name;
    private static int totalStudent = 0;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        totalStudent++;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + studentId);
        System.out.println("Tên SV: " + name);
        System.out.println("-------------------");
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên: " + totalStudent);
    }
}
