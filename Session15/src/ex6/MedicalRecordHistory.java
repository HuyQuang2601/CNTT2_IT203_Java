package ex6;

import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> editStack;
    private String recordId;

    public MedicalRecordHistory(String recordId) {
        this.recordId = recordId;
        editStack = new Stack<>();
    }

    public void addEdit(EditAction action) {
        editStack.push(action);
    }

    public EditAction undo() {

        if (editStack.isEmpty()) {
            System.out.println("Không có gì để undo!");
            return null;
        }

        return editStack.pop();
    }

    public void display() {

        if (editStack.isEmpty()) {
            System.out.println("Lịch sử rỗng!");
            return;
        }

        System.out.println("Lịch sử chỉnh sửa:");

        for (int i = editStack.size() - 1; i >= 0; i--) {
            System.out.println(editStack.get(i));
        }
    }
}
