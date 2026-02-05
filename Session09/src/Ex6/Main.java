package ex6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        // Overloading được quyết định lúc compile-time
        shapes.add(new Circle(5));          // r = 5
        shapes.add(new Rectangle(3, 4));    // HCN
        shapes.add(new Rectangle(6));       // Hình vuông

        double totalArea = 0;

        System.out.println("Kết quả tính toán hình học:\n");

        int index = 1;

        for (Shape s : shapes) {

            double area = s.calculateArea();

            totalArea += area;

            if (s instanceof Circle) {
                Circle c = (Circle) s;

                System.out.printf("%d. Hình tròn (r=%.1f) - Diện tích: %.2f\n",
                        index, c.getRadius(), area);

            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;

                if (r.getWidth() == r.getHeight()) {
                    System.out.printf("%d. Hình vuông (cạnh %.1f) - Diện tích: %.2f\n",
                            index, r.getWidth(), area);
                } else {
                    System.out.printf("%d. Hình chữ nhật (%.1f x %.1f) - Diện tích: %.2f\n",
                            index, r.getWidth(), r.getHeight(), area);
                }
            }

            index++;
        }

        System.out.printf("\n=> Tổng diện tích các hình: %.2f\n", totalArea);
    }
}
