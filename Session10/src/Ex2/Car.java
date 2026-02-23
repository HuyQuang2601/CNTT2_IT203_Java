package Ex2;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand); // Gọi constructor lớp cha
    }

    @Override
    public void move() {
        System.out.println("Di chuyển bằng động cơ");
    }
}