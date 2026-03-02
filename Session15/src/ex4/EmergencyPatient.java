package ex4;

public class EmergencyPatient {

    private String id;
    private String name;
    private int priority; // 1: cấp cứu, 2: thường
    private long order;   // thứ tự vào (để FIFO)

    // Constructor
    public EmergencyPatient(String id, String name, int priority, long order) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.order = order;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }

    @Override
    public String toString() {
        String level = (priority == 1) ? "Cấp cứu" : "Thường";

        return "ID: " + id +
                " | Tên: " + name +
                " | Mức: " + level;
    }
}