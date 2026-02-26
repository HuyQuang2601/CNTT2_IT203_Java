package Ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Medicine> cart = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== KÊ ĐƠN THUỐC =====");
            System.out.println("1. Thêm thuốc vào đơn");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn");
            System.out.println("5. Tìm thuốc giá rẻ (<50.000)");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addMedicine();
                    break;

                case 2:
                    updateQuantity();
                    break;

                case 3:
                    removeMedicine();
                    break;

                case 4:
                    printBill();
                    break;

                case 5:
                    findCheapMedicine();
                    break;

                case 0:
                    System.out.println("Kết thúc chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }

    static void addMedicine() {

        System.out.print("Mã thuốc: ");
        String id = sc.nextLine();

        Medicine old = findById(id);

        if (old != null) {
            // Đã tồn tại → cộng số lượng
            System.out.print("Nhập số lượng thêm: ");
            int more = sc.nextInt();
            sc.nextLine();

            old.setQuantity(old.getQuantity() + more);

            System.out.println("Đã cộng thêm số lượng!");
            return;
        }

        // Chưa có → thêm mới
        System.out.print("Tên thuốc: ");
        String name = sc.nextLine();

        System.out.print("Đơn giá: ");
        double price = sc.nextDouble();

        System.out.print("Số lượng: ");
        int qty = sc.nextInt();
        sc.nextLine();

        cart.add(new Medicine(id, name, price, qty));

        System.out.println("Thêm thuốc thành công!");
    }

    static void updateQuantity() {

        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        Medicine m = findById(id);

        if (m == null) {
            System.out.println("Không tìm thấy thuốc!");
            return;
        }

        System.out.print("Số lượng mới: ");
        int newQty = sc.nextInt();
        sc.nextLine();

        if (newQty == 0) {
            cart.remove(m);
            System.out.println("Đã xóa thuốc!");
        } else {
            m.setQuantity(newQty);
            System.out.println("Cập nhật thành công!");
        }
    }

    static void removeMedicine() {

        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();

        Medicine m = findById(id);

        if (m == null) {
            System.out.println("Không tìm thấy thuốc!");
            return;
        }

        cart.remove(m);

        System.out.println("Xóa thành công!");
    }

    static void printBill() {

        if (cart.isEmpty()) {
            System.out.println("Đơn thuốc trống!");
            return;
        }

        double total = 0;

        System.out.println("\n========== HÓA ĐƠN ==========");
        System.out.printf("%-10s %-20s %-10s %-10s %-12s\n",
                "Mã", "Tên", "Giá", "SL", "Thành tiền");

        for (Medicine m : cart) {

            double money = m.getTotalPrice();
            total += money;

            System.out.printf("%-10s %-20s %-10.0f %-10d %-12.0f\n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity(),
                    money);
        }

        System.out.println("--------------------------------------------");
        System.out.printf("TỔNG TIỀN: %.0f VNĐ\n", total);

        // Xóa đơn sau khi in
        cart.clear();

        System.out.println("Đã reset đơn thuốc!");
    }

    static void findCheapMedicine() {

        boolean found = false;

        System.out.println("\nThuốc giá dưới 50.000:");

        for (Medicine m : cart) {

            if (m.getUnitPrice() < 50000) {

                System.out.println(
                        m.getDrugId() + " | " +
                                m.getDrugName() + " | " +
                                m.getUnitPrice() + " VNĐ"
                );

                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có thuốc phù hợp!");
        }
    }
    static Medicine findById(String id) {

        for (Medicine m : cart) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                return m;
            }
        }

        return null;
    }
}
