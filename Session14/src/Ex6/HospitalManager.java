package Ex6;

import java.util.*;

public class HospitalManager {

    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 30, "Tim mạch"),
                new Patient("Hùng", 45, "Nội tiết"),
                new Patient("Mai", 28, "Tim mạch")
        );

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patients) {

            String dept = p.getDepartment();

            if (!departmentMap.containsKey(dept)) {
                departmentMap.put(dept, new ArrayList<>());
            }

            departmentMap.get(dept).add(p);
        }

        System.out.println("Danh sách theo khoa:");
        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + " -> " + entry.getValue());
        }

        String maxDept = null;
        int maxSize = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > maxSize) {
                maxSize = entry.getValue().size();
                maxDept = entry.getKey();
            }
        }

        System.out.println("\nKhoa " + maxDept + " đang đông nhất (" + maxSize + " bệnh nhân)");
    }
}