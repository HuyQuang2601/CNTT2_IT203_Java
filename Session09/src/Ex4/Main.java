package ex4;

public class Main {
    public static void main(String[] args) {

        // Declared Type: Animal
        // Actual Type: Dog
        Animal animal = new Dog();

        // Gọi method chung (đa hình runtime)
        animal.sound();   // Dog.sound() được gọi

        //  Không gọi được method riêng
        // animal.wagTail(); // LỖI BIÊN DỊCH

        //  Downcasting an toàn
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Ép kiểu
            dog.wagTail();
        }

        // Ví dụ sai (ClassCastException)
        Animal a2 = new Cat();

        //  Ép kiểu sai → lỗi runtime
        // Dog d2 = (Dog) a2; // Crash chương trình
    }
}

