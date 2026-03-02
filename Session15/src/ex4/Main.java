package ex4;

public class Main {

    public static void main(String[] args) {

        EmergencyQueue manager = new EmergencyQueue();

        // Thêm bệnh nhân
        manager.addPatient("BN01", "Nguyễn Văn A", 2);
        manager.addPatient("BN02", "Trần Thị B", 1);
        manager.addPatient("BN03", "Lê Văn C", 2);
        manager.addPatient("BN04", "Phạm Văn D", 1);
        manager.addPatient("BN05", "Hoàng Thị E", 1);

        System.out.println();

        // Hiển thị danh sách
        manager.displayQueue();

        System.out.println();

        // Gọi khám
        System.out.println("Gọi khám:");

        while (true) {

            EmergencyPatient p = manager.callNextPatient();

            if (p == null) break;

            System.out.println("Đang khám: " + p);
        }
    }
}