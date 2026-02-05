package ex5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Thêm dữ liệu mẫu
        employees.add(new OfficeEmployee("Nguyen Van A", 10000000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30000));

        double totalSalary = 0;

        System.out.println("Danh sách lương nhân viên:");

        int index = 1;

        // Duyệt danh sách (ĐA HÌNH)
        for (Employee e : employees) {

            double salary = e.calculateSalary(); // Runtime Polymorphism
            totalSalary += salary;

            System.out.print(index + ". " + e.getName());

            if (e instanceof OfficeEmployee) {
                System.out.print(" (Office)");
            } else {
                System.out.print(" (Production)");
            }

            System.out.println(" - Lương: " + String.format("%,.0f", salary));

            index++;
        }

        System.out.println("\n=> TỔNG LƯƠNG CÔNG TY: "
                + String.format("%,.0f", totalSalary));
    }
}

