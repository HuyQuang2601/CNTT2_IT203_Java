package Ex3;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Tên: " + name);
    }
}