package ex5;

public class ProductionEmployee extends Employee {

    private int numOfProducts;
    private double price;

    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }

    @Override
    public double calculateSalary() {
        return numOfProducts * price;
    }

    // Phục vụ hiển thị chi tiết
    public String getDetail() {
        return numOfProducts + " sản phẩm * " + (int)price;
    }
}
