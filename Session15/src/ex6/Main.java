package ex6;
public class Main {

    public static void main(String[] args) {
        // 1. QUEUE BỆNH NHÂN
        System.out.println("=== PATIENT QUEUE ===");

        PatientWaitingQueue pq = new PatientWaitingQueue();

        pq.addPatient(new Patient("P01", "An", 20, "Nam"));
        pq.addPatient(new Patient("P02", "Bình", 25, "Nữ"));
        pq.addPatient(new Patient("P03", "Cường", 30, "Nam"));

        pq.display();

        System.out.println("Gọi tiếp: " + pq.callNext());
        pq.display();

        // 2. STACK SỬA BỆNH ÁN

        System.out.println("\n=== EDIT HISTORY ===");

        MedicalRecordHistory history =
                new MedicalRecordHistory("R01");

        history.addEdit(new EditAction(
                "Sửa tên", "BS A", "10:00"));

        history.addEdit(new EditAction(
                "Sửa tuổi", "BS B", "10:10"));

        history.display();

        System.out.println("Undo: " + history.undo());
        history.display();

        // 3. HỆ THỐNG GỌI SỐ
        System.out.println("\n=== TICKET SYSTEM ===");

        TicketSystem ts = new TicketSystem();

        ts.issueTicket();
        ts.issueTicket();
        ts.issueTicket();

        ts.display();

        System.out.println("Gọi số: " + ts.callNext());
        ts.display();

        // 4. UNDO NHẬP LIỆU

        System.out.println("\n=== UNDO MANAGER ===");

        UndoManager um = new UndoManager(5);

        um.addAction(new InputAction(
                "Name", "An", "Bình", "11:00"));

        um.addAction(new InputAction(
                "Age", "20", "21", "11:05"));

        um.display();

        System.out.println("Undo: " + um.undo());

        um.display();
    }
}