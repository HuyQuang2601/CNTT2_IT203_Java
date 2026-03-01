package Ex1;

import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Set;


public class Ex1 {
    public static void main(String[] args) {

        String[] input = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };

        Set<String> danhSachCho = new LinkedHashSet<>();

        danhSachCho.addAll(Arrays.asList(input));

        System.out.println("Danh sách gọi khám:");
        for (String benhNhan : danhSachCho) {
            System.out.println(benhNhan);
        }
    }
}