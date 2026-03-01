package Ex4;

import java.util.*;

public class Ex4 {
    public static void main(String[] args) {

        List<String> danhSachBenh = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );

        Map<String, Integer> thongKe = new TreeMap<>();

        for (String benh : danhSachBenh) {
            if (thongKe.containsKey(benh)) {
                thongKe.put(benh, thongKe.get(benh) + 1);
            } else {
                thongKe.put(benh, 1);
            }
        }

        System.out.println("Báo cáo ca bệnh (đã sắp xếp):");
        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}