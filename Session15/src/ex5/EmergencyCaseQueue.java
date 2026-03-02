package ex5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        cases = new LinkedList<>();
    }

    // Thêm ca cấp cứu
    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Đã tiếp nhận: " + c);
    }

    // Lấy ca tiếp theo
    public EmergencyCase getNextCase() {

        if (cases.isEmpty()) {
            System.out.println("Không còn ca cấp cứu!");
            return null;
        }

        return cases.poll();
    }

    public boolean isEmpty() {
        return cases.isEmpty();
    }
}
