package ex6;
import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingQueue {

    private Queue<Patient> waitingQueue;
    private int totalPatients;

    public PatientWaitingQueue() {
        waitingQueue = new LinkedList<>();
        totalPatients = 0;
    }

    public void addPatient(Patient p) {
        waitingQueue.offer(p);
        totalPatients++;
    }

    public Patient callNext() {

        if (waitingQueue.isEmpty()) {
            System.out.println("Không còn bệnh nhân!");
            return null;
        }

        totalPatients--;
        return waitingQueue.poll();
    }

    public void display() {

        if (waitingQueue.isEmpty()) {
            System.out.println("Hàng chờ rỗng!");
            return;
        }

        System.out.println("Danh sách bệnh nhân:");

        for (Patient p : waitingQueue) {
            System.out.println(p);
        }
    }
}