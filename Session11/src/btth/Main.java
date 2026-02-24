package btth;

class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee(1, "Bac xiu", 30000, true);
        drinks[1] = new FruitJuice(2, "Nuoc Cam", 40000, 10);
        for (Drink drink : drinks) {
            if (drink != null) {
                drink.displayInfo();
                System.out.printf("Gia tien: %.2f\n", drink.calculatePrice());
                if (drink instanceof FruitJuice) {
                    ((FruitJuice) drink).mix();
                }
            }
        }
    }
}
