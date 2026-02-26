package BTTH2;

public class Category {

    private int id;
    private String name;
    private String description;

    public Category() {
    }

    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getter - Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Hiển thị dữ liệu
    public void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Mô tả: " + description);
        System.out.println("----------------------");
    }
}