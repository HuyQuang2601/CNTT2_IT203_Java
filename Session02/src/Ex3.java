import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach tra muon: ");
        int n = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so ngay tre cua cuon thu " + i + ": ");
            int daysLate = sc.nextInt();
            total += daysLate * 5000;
        }
        System.out.println("===> Tong tien phat: " + total + " VND");
        sc.close();
    }
}
