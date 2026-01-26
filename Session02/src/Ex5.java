import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int credit = 100;
        int lateDays;
        System.out.println("--- HE THONG DANH GIA DOC GIA ---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");
        while (true) {
            System.out.print("So ngay tre cua lan nay: ");
            lateDays = sc.nextInt();
            if (lateDays == 999) {
                break;
            }
            if (lateDays <= 0) {
                credit += 5;
                System.out.println("-> Tra dung han: +5 diem.");
            } else {
                int penalty = lateDays * 2;
                credit -= penalty;
                System.out.println("-> Tra tre " + lateDays + " ngay: -" + penalty + " diem.");
            }
            System.out.println();
        }
        System.out.println("Tong diem uy tin: " + credit);

        if (credit > 120) {
            System.out.println("Xep loai: DOC GIA THAN THIET");
        } else if (credit >= 80) {
            System.out.println("Xep loai: DOC GIA TIEU CHUAN");
        } else {
            System.out.println("Xep loai: DOC GIA CAN LUU Y");
        }
        sc.close();
    }
}
