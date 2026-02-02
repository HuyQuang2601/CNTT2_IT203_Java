package Ex1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "Nguyễn Văn A");
        Student s2 = new Student("SV02", "Trần Thị B");
        Student s3 = new Student("SV03", "Lê Văn C");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        Student.displayTotalStudent();
    }
}
