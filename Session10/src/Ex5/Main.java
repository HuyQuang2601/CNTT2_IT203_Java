package Ex5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        // Thêm nhân viên
        employees.add(new OfficeStaff("Nguyễn Văn A", 6000000));
        employees.add(new Manager("Trần Văn B", 10000000, 3000000));
        employees.add(new OfficeStaff("Lê Thị C", 5500000));
        employees.add(new Manager("Phạm Văn D", 12000000, 5000000));

        System.out.println("===== BẢNG LƯƠNG CÔNG TY =====\n");

        for (Employee emp : employees) {

            emp.showInfo();

            // Kiểm tra có thưởng không
            if (emp instanceof BonusCalculator) {
                BonusCalculator b = (BonusCalculator) emp;
                System.out.println("Thưởng KPI: " + b.getBonus());
            } else {
                System.out.println("Thưởng KPI: Không có");
            }

            System.out.println("Lương thực nhận: " + emp.calculateSalary());
            System.out.println("----------------------------");
        }
    }
}