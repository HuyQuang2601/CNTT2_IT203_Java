package ex5;

public class Main {

    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        // Tạo bệnh nhân
        Patient p1 = new Patient("BN01", "Nguyễn Văn A", 30);
        Patient p2 = new Patient("BN02", "Trần Thị B", 25);

        // Tạo ca cấp cứu
        EmergencyCase c1 = new EmergencyCase(p1);
        EmergencyCase c2 = new EmergencyCase(p2);

        // Thêm vào queue
        queue.addCase(c1);
        queue.addCase(c2);

        System.out.println("\n--- BẮT ĐẦU XỬ LÝ ---\n");

        // Xử lý từng ca
        while (!queue.isEmpty()) {

            EmergencyCase current = queue.getNextCase();

            System.out.println("Đang xử lý: " + current);

            // Thêm các bước
            current.addStep(
                    new TreatmentStep("Tiếp nhận", "09:00")
            );

            current.addStep(
                    new TreatmentStep("Chẩn đoán", "09:10")
            );

            current.addStep(
                    new TreatmentStep("Điều trị", "09:30")
            );

            System.out.println();

            // Hiển thị
            current.displaySteps();

            System.out.println();

            // Undo thử
            System.out.println("Undo bước gần nhất:");
            TreatmentStep undo = current.undoStep();
            System.out.println("Đã hủy: " + undo);

            System.out.println();

            // Hiển thị lại
            current.displaySteps();

            System.out.println("-----------------------\n");
        }
    }
}
