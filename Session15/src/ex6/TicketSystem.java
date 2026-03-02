package ex6;

import java.util.LinkedList;
import java.util.Queue;
import java.time.LocalTime;

public class TicketSystem {

    private Queue<Ticket> ticketQueue;
    private int currentNumber;

    public TicketSystem() {
        ticketQueue = new LinkedList<>();
        currentNumber = 1;
    }

    public void issueTicket() {

        String time = LocalTime.now().toString();

        Ticket t = new Ticket(currentNumber, time);
        ticketQueue.offer(t);

        currentNumber++;
    }

    public Ticket callNext() {

        if (ticketQueue.isEmpty()) {
            System.out.println("Không còn số!");
            return null;
        }

        return ticketQueue.poll();
    }

    public void display() {

        if (ticketQueue.isEmpty()) {
            System.out.println("Danh sách số rỗng!");
            return;
        }

        System.out.println("Danh sách số chờ:");

        for (Ticket t : ticketQueue) {
            System.out.println(t);
        }
    }
}
