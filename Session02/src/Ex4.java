import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookID;
        do {
            System.out.print("Nhap ma ID sach moi (phai > 0): ");
            bookID = sc.nextInt();

            if (bookID <= 0) {
                System.out.println("Loi: ID phai la so duong. Moi nhap lai!");
            }
        } while (bookID <= 0);
        System.out.println("Xac nhan: Ma sach " + bookID + " da duoc ghi nhan.");
        sc.close();
    }
}
