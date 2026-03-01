package Ex3;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {

        Set<String> thuoc = new HashSet<>(Arrays.asList(
                "Aspirin", "Caffeine", "Paracetamol"
        ));

        Set<String> diUng = new HashSet<>(Arrays.asList(
                "Penicillin", "Aspirin"
        ));

        Set<String> canhBao = new HashSet<>(thuoc);
        canhBao.retainAll(diUng);

        Set<String> anToan = new HashSet<>(thuoc);
        anToan.removeAll(diUng);

        System.out.println("Cảnh báo dị ứng: " + canhBao);
        System.out.println("Thành phần an toàn: " + anToan);
    }
}