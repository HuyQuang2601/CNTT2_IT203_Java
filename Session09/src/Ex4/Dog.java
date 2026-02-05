package ex4;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu!");
    }

    // Phương thức riêng của Dog
    public void wagTail() {
        System.out.println("Chó vẫy đuôi 🐕");
    }
}
