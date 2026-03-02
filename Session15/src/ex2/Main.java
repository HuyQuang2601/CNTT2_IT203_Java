package ex2;

public class Main {

    public static void main(String[] args) {

        PatientQueue manager = new PatientQueue();

        manager.addPatient(new Patient("BN01", "Nguyễn Văn A", 30));
        manager.addPatient(new Patient("BN02", "Trần Thị B", 25));
        manager.addPatient(new Patient("BN03", "Lê Văn C", 40));

        System.out.println();

        manager.displayQueue();

        System.out.println();

        System.out.println("Bệnh nhân tiếp theo:");
        System.out.println(manager.peekNextPatient());

        System.out.println();

        System.out.println("Gọi khám:");
        Patient p = manager.callNextPatient();
        System.out.println("Đang khám: " + p);

        System.out.println();

        // Hiển thị lại
        manager.displayQueue();
    }
}