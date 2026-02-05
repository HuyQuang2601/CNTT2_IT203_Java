package baitap;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        Random rand = new Random();

        // Khởi tạo ngẫu nhiên 10 hình
        for (int i = 0; i < shapes.length; i++) {
            int type = rand.nextInt(3); // 0: Rectangle, 1: Triangle, 2: Circle
            switch (type) {
                case 0:
                    shapes[i] = new Rectangle(rand.nextInt(10) + 1, rand.nextInt(10) + 1);
                    break;
                case 1:
                    double a = rand.nextInt(10) + 3;
                    double b = rand.nextInt(10) + 3;
                    double c = rand.nextInt(10) + 3;
                    // đảm bảo tam giác hợp lệ
                    if (a + b > c && a + c > b && b + c > a) {
                        shapes[i] = new Triangle(a, b, c);
                    } else {
                        shapes[i] = new Triangle(3, 4, 5); // fallback
                    }
                    break;
                case 2:
                    shapes[i] = new Circle(rand.nextInt(10) + 1);
                    break;
            }
        }

        // 1. Duyệt và in thông tin chi tiết
        for (Shape s : shapes) {
            System.out.println(s.getInfo());
        }

        // 2. Thống kê số lượng mỗi loại hình
        int countRect = 0, countTri = 0, countCircle = 0;
        for (Shape s : shapes) {
            if (s instanceof Rectangle) countRect++;
            else if (s instanceof Triangle) countTri++;
            else if (s instanceof Circle) countCircle++;
        }

        System.out.println("\nThống kê số lượng:");
        System.out.println("Rectangle: " + countRect);
        System.out.println("Triangle: " + countTri);
        System.out.println("Circle: " + countCircle);
    }
}