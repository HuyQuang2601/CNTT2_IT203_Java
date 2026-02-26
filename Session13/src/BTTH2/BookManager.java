package BTTH2;

import java.util.ArrayList;

public class BookManager implements IManager<Book> {

    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public void add(Book item) {
        books.add(item);
        System.out.println("Thêm sách thành công!");
    }

    @Override
    public void update(Book item) {

        boolean found = false;

        for (Book b : books) {
            if (b.getId() == item.getId()) {
                b.setTitle(item.getTitle());
                b.setAuthor(item.getAuthor());
                b.setCategoryId(item.getCategoryId());
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Không tìm thấy ID!");
        }
    }

    @Override
    public void delete(int id) {

        Book deleteBook = null;

        for (Book b : books) {
            if (b.getId() == id) {
                deleteBook = b;
                break;
            }
        }

        if (deleteBook != null) {
            books.remove(deleteBook);
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không tìm thấy ID!");
        }
    }

    @Override
    public void displayAll() {

        if (books.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (Book b : books) {
            b.displayData();
        }
    }
}
