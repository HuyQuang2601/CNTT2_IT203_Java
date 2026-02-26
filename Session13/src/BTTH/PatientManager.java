package BTTH;

import java.util.ArrayList;

public class PatientManager {

    private ArrayList<Patient> patients = new ArrayList<>();

    // Thêm bệnh nhân
    public void addPatient(Patient patient) {

        // Kiểm tra trùng ID
        if (findById(patient.getId()) != null) {
            System.out.println("ID đã tồn tại!");
            return;
        }

        patients.add(patient);
        System.out.println("Thêm bệnh nhân thành công!");
    }

    // Xóa bệnh nhân
    public void removePatient(String patientId) {

        Patient p = findById(patientId);

        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân!");
            return;
        }

        patients.remove(p);
        System.out.println("Xóa thành công!");
    }

    // Cập nhật bệnh nhân
    public void updatePatient(String patientId, Patient updatedPatient) {

        Patient p = findById(patientId);

        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân!");
            return;
        }

        p.setName(updatedPatient.getName());
        p.setAge(updatedPatient.getAge());
        p.setGender(updatedPatient.getGender());
        p.setDisease(updatedPatient.getDisease());

        System.out.println("Cập nhật thành công!");
    }

    // Tìm theo tên
    public void searchPatientByName(String name) {

        boolean found = false;

        for (Patient p : patients) {

            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy bệnh nhân!");
        }
    }

    // Hiển thị danh sách
    public void displayPatients() {

        if (patients.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (Patient p : patients) {
            p.display();
        }
    }

    // Tìm theo ID
    private Patient findById(String id) {

        for (Patient p : patients) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }

        return null;
    }
}