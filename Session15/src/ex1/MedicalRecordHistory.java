package ex1;
import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> history;
    // Constructor
    public MedicalRecordHistory() {
        history = new Stack<>();
    }
    // Thêm chỉnh sửa
    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã thêm: " + action);
    }
    // Undo
    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Không có chỉnh sửa để Undo!");
            return null;
        }

        return history.pop();
    }
    // Xem chỉnh sửa gần nhất
    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Chưa có chỉnh sửa!");
            return null;
        }

        return history.peek();
    }
    // Kiểm tra rỗng
    public boolean isEmpty() {
        return history.isEmpty();
    }
    // Hiển thị lịch sử
    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Lịch sử trống!");
            return;
        }

        System.out.println("Danh sách chỉnh sửa:");

        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}