package Ex6;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Hiển thị thông tin
    @Override
    public String toString() {
        return name + " - Giá: " + price;
    }
}