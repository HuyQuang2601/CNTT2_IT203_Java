package Ex5;

import java.util.Set;
import java.util.TreeSet;

public class EmergencyQueue {

    public static void main(String[] args) {

        Set<Patient> queue = new TreeSet<>(new PatientComparator());

        queue.add(new Patient("Bệnh nhân A", 3, 800));
        queue.add(new Patient("Bệnh nhân B", 1, 815));
        queue.add(new Patient("Bệnh nhân C", 1, 805));

        System.out.println("Thứ tự xử lý:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}