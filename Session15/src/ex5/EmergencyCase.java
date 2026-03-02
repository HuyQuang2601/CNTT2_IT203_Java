package ex5;

import java.util.Stack;

public class EmergencyCase {

    private Patient patient;
    private Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    // Thêm bước điều trị
    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Đã thêm bước: " + step);
    }

    // Undo bước gần nhất
    public TreatmentStep undoStep() {

        if (steps.isEmpty()) {
            System.out.println("Không còn bước nào để undo!");
            return null;
        }

        return steps.pop();
    }

    // Hiển thị các bước
    public void displaySteps() {

        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý!");
            return;
        }

        System.out.println("Các bước điều trị:");

        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println("- " + steps.get(i));
        }
    }

    public Patient getPatient() {
        return patient;
    }

    @Override
    public String toString() {
        return patient.toString();
    }
}
