package Ex3;

public class Fish extends Animal implements Swimmable {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Cá đang bơi dưới nước");
    }
}