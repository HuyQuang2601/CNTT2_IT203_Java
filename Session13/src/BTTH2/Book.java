package BTTH2;

public class Book {

    private int id;
    private String title;
    private String author;
    private int categoryId;

    public Book() {
    }

    public Book(int id, String title, String author, int categoryId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.categoryId = categoryId;
    }

    // Getter - Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    // Hiển thị dữ liệu
    public void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Tiêu đề: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Mã danh mục: " + categoryId);
        System.out.println("----------------------");
    }
}
