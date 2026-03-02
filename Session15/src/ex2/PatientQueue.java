package ex2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {

    private Queue<Patient> queue;

    // Constructor
    public PatientQueue() {
        queue = new LinkedList<>();
    }

    // Thêm bệnh nhân (enqueue)
    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Đã thêm: " + p);
    }

    // Gọi bệnh nhân tiếp theo (dequeue)
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân!");
            return null;
        }

        return queue.poll();
    }

    // Xem bệnh nhân tiếp theo (peek)
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách trống!");
            return null;
        }

        return queue.peek();
    }

    // Kiểm tra rỗng
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Hiển thị danh sách chờ
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân đang chờ!");
            return;
        }

        System.out.println("Danh sách bệnh nhân đang chờ:");

        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
