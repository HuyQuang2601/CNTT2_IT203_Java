package ex6;

public class Rectangle extends Shape {

    private double width;
    private double height;

    // Overloading constructor 1: Hình chữ nhật
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Overloading constructor 2: Hình vuông
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    // Overriding
    @Override
    public double calculateArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

