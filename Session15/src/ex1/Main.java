package ex1;

public class Main {

    public static void main(String[] args) {
        MedicalRecordHistory manager = new MedicalRecordHistory();
        // Thêm chỉnh sửa
        manager.addEdit(new EditAction(
                "Cập nhật huyết áp",
                "09:00 02/03/2026"
        ));

        manager.addEdit(new EditAction(
                "Sửa chuẩn đoán",
                "09:30 02/03/2026"
        ));

        manager.addEdit(new EditAction(
                "Thêm kết quả xét nghiệm",
                "10:00 02/03/2026"
        ));

        System.out.println();

        manager.displayHistory();

        System.out.println();

        System.out.println("Chỉnh sửa gần nhất:");
        System.out.println(manager.getLatestEdit());

        System.out.println();
        // Undo
        System.out.println("Undo:");
        EditAction undone = manager.undoEdit();
        System.out.println("Đã hoàn tác: " + undone);

        System.out.println();

        manager.displayHistory();
    }
}
