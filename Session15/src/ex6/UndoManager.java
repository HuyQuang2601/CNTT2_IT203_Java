package ex6;
import java.util.Stack;

public class UndoManager {

    private Stack<InputAction> undoStack;
    private int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {

        this.maxUndoSteps = maxUndoSteps;
        undoStack = new Stack<>();
    }

    public void addAction(InputAction action) {

        if (undoStack.size() >= maxUndoSteps) {
            undoStack.remove(0); // xóa cái cũ nhất
        }

        undoStack.push(action);
    }

    public InputAction undo() {

        if (undoStack.isEmpty()) {
            System.out.println("Không có gì để undo!");
            return null;
        }

        return undoStack.pop();
    }

    public void display() {

        if (undoStack.isEmpty()) {
            System.out.println("Undo stack rỗng!");
            return;
        }

        System.out.println("Danh sách Undo:");

        for (int i = undoStack.size() - 1; i >= 0; i--) {
            System.out.println(undoStack.get(i));
        }
    }
}