package BTTH2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IManager<Category> categoryManager = new CategoryManager();
        IManager<Book> bookManager = new BookManager();

        int choice;

        do {

            System.out.println("\n===== MENU CHÍNH =====");
            System.out.println("1. Quản lý Danh mục");
            System.out.println("2. Quản lý Sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    categoryMenu(sc, categoryManager);
                    break;

                case 2:
                    bookMenu(sc, bookManager, categoryManager);
                    break;

                case 0:
                    System.out.println("Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);

        sc.close();
    }

    // MENU DANH MỤC
    private static void categoryMenu(Scanner sc, IManager<Category> manager) {

        int choice;

        do {

            System.out.println("\n--- QUẢN LÝ DANH MỤC ---");
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Hiển thị");
            System.out.println("0. Quay lại");
            System.out.print("Chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Nhập ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập mô tả: ");
                    String des = sc.nextLine();

                    manager.add(new Category(id, name, des));
                    break;

                case 2:
                    System.out.print("Nhập ID cần sửa: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Tên mới: ");
                    String newName = sc.nextLine();

                    System.out.print("Mô tả mới: ");
                    String newDes = sc.nextLine();

                    manager.update(new Category(uid, newName, newDes));
                    break;

                case 3:
                    System.out.print("Nhập ID cần xóa: ");
                    int did = sc.nextInt();

                    manager.delete(did);
                    break;

                case 4:
                    manager.displayAll();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Sai lựa chọn!");
            }

        } while (choice != 0);
    }

    // MENU SÁCH
    private static void bookMenu(Scanner sc,
                                 IManager<Book> bookManager,
                                 IManager<Category> categoryManager) {

        int choice;

        do {

            System.out.println("\n--- QUẢN LÝ SÁCH ---");
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Hiển thị");
            System.out.println("0. Quay lại");
            System.out.print("Chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("Danh mục hiện có:");
                    categoryManager.displayAll();

                    System.out.print("ID sách: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Tiêu đề: ");
                    String title = sc.nextLine();

                    System.out.print("Tác giả: ");
                    String author = sc.nextLine();

                    System.out.print("ID danh mục: ");
                    int cid = sc.nextInt();

                    bookManager.add(new Book(id, title, author, cid));
                    break;

                case 2:

                    System.out.print("ID cần sửa: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Tiêu đề mới: ");
                    String newTitle = sc.nextLine();

                    System.out.print("Tác giả mới: ");
                    String newAuthor = sc.nextLine();

                    System.out.print("ID danh mục mới: ");
                    int newCid = sc.nextInt();

                    bookManager.update(
                            new Book(uid, newTitle, newAuthor, newCid)
                    );
                    break;

                case 3:

                    System.out.print("ID cần xóa: ");
                    int did = sc.nextInt();

                    bookManager.delete(did);
                    break;

                case 4:

                    bookManager.displayAll();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Sai lựa chọn!");
            }

        } while (choice != 0);
    }
}