package Ex4;

import java.util.LinkedList;

public class EmergencyRoom {
    private LinkedList<String> queue = new LinkedList<>();

    public void patientCheckIn(String name) {
        queue.addLast(name);
    }

    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
    }

    public void treatPatient() {
        if (!queue.isEmpty()) {
            String patient = queue.removeFirst();
            if (patient.equals("C")) {
                System.out.println("Đang cấp cứu: " + patient);
            } else {
                System.out.println("Đang khám: " + patient);
            }
        } else {
            System.out.println("Không còn bệnh nhân trong danh sách.");
        }
    }

    public static void main(String[] args) {
        EmergencyRoom er = new EmergencyRoom();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}

