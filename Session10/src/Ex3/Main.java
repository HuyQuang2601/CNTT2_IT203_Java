package Ex3;

public class Main {

    public static void main(String[] args) {

        Duck duck = new Duck("Vịt Donald");
        Fish fish = new Fish("Cá Nemo");

        System.out.println("=== Thông tin Vịt ===");
        duck.showName();
        duck.swim();
        duck.fly();

        System.out.println();

        System.out.println("=== Thông tin Cá ===");
        fish.showName();
        fish.swim();

    }
}