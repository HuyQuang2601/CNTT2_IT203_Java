import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.print("Nhập số sách đang mượn: ");
        int booksBorrowed = sc.nextInt();
        if (age >= 18 && booksBorrowed < 3) {
            System.out.println("Cho phép mượn sách");
        } else {
            if (age < 18 && booksBorrowed >= 3) {
                System.out.println("Bạn chưa đủ tuổi và đã mượn quá số lượng cho phép");
            } else if (age < 18) {
                System.out.println("Bạn chưa đủ tuổi");
            } else {
                System.out.println("Bạn đã mượn quá số lượng cho phép");
            }
        }
        sc.close();
    }
}
