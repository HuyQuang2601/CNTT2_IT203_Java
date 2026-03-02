package ex4;

import java.util.PriorityQueue;

public class EmergencyQueue {

    private PriorityQueue<EmergencyPatient> queue;
    private long counter = 0; // đếm thứ tự vào

    // Constructor
    public EmergencyQueue() {

        queue = new PriorityQueue<>(
                (p1, p2) -> {

                    // So sánh theo priority trước
                    if (p1.getPriority() != p2.getPriority()) {
                        return p1.getPriority() - p2.getPriority();
                    }

                    // Nếu cùng priority → FIFO
                    return Long.compare(p1.getOrder(), p2.getOrder());
                }
        );
    }

    // Thêm bệnh nhân
    public void addPatient(String id, String name, int priority) {

        EmergencyPatient p =
                new EmergencyPatient(id, name, priority, counter++);

        queue.offer(p);

        System.out.println("Đã thêm: " + p);
    }

    // Gọi bệnh nhân tiếp theo
    public EmergencyPatient callNextPatient() {

        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân!");
            return null;
        }

        return queue.poll();
    }

    // Hiển thị danh sách
    public void displayQueue() {

        if (queue.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.println("Danh sách bệnh nhân đang chờ:");

        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}