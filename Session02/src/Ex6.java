import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        int borrow;
        for (int day = 2; day <= 8; day++) {
            if (day == 8) {
                System.out.print("Nhap luot muon ngay Chu Nhat: ");
            } else {
                System.out.print("Nhap luot muon ngay Thu " + day + ": ");
            }
            borrow = sc.nextInt();
            if (borrow == 0) {
                continue;
            }
            if (borrow > max) {
                max = borrow;
            }
            if (borrow < min) {
                min = borrow;
            }
            sum += borrow;
            count++;
        }
        System.out.println("\n--- KET QUA THONG KE ---");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.println("Trung binh luot muon/ngay: " + (double) sum / count);

        sc.close();
    }
}
