package btth;

abstract class Drink {
    protected int id;
    protected String name;
    protected double price;
    public Drink(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    abstract double calculatePrice();
    public void displayInfo(){
        System.out.println("Ma" +id + "\nTen" + name + "\nGia goc" + price);
    }
}
