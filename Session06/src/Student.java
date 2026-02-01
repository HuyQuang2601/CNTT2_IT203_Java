public class Student {
    private String studentId;
    private String fullName;
    private int birthYear;
    private double averageScore;

    public Student(String studentId, String fullName, int birthYear, double averageScore) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.averageScore = averageScore;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Điểm TB: " + averageScore);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyễn Văn A", 2003, 8.5);
        Student s2 = new Student("SV002", "Trần Thị B", 2004, 7.8);

        s1.displayInfo();
        s2.displayInfo();
    }
}
