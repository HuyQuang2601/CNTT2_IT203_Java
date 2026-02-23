package Ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 15000000));
        products.add(new Product("Chuột", 200000));
        products.add(new Product("Bàn phím", 500000));
        products.add(new Product("Tai nghe", 800000));
        Collections.sort(products, new Comparator<Product>() {
            int count = 0;

            @Override
            public int compare(Product p1, Product p2) {
                count++;

                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("=== Danh sách theo GIÁ tăng dần (Anonymous Class) ===");
        for (Product p : products) {
            System.out.println(p);
        }

        Collections.sort(products,
                (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName())
        );

        System.out.println("\n=== Danh sách theo TÊN A-Z (Lambda) ===");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}