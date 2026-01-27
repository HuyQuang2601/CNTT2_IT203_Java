import java.util.Scanner;

public class Ex2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Doraemon",
                "Conan",
                "Harry Potter",
                "One Piece",
                "Clean Code"
        };

        System.out.print("Nhập tên sách cần tìm: ");
        String name = sc.nextLine();

        int index = searchBooks(books, name);

        if (index != -1) {
            System.out.println("Tìm thấy sách '" + name + "' tại vị trí số: " + index);
        } else {
            System.out.println("Sách không tồn tại trong thư viện.");
        }
    }
}
