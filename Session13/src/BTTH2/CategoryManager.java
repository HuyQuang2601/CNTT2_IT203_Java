package BTTH2;

import java.util.ArrayList;

public class CategoryManager implements IManager<Category> {

    private ArrayList<Category> categories = new ArrayList<>();

    @Override
    public void add(Category item) {
        categories.add(item);
        System.out.println("Thêm danh mục thành công!");
    }

    @Override
    public void update(Category item) {

        boolean found = false;

        for (Category c : categories) {
            if (c.getId() == item.getId()) {
                c.setName(item.getName());
                c.setDescription(item.getDescription());
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

        Category deleteCategory = null;

        for (Category c : categories) {
            if (c.getId() == id) {
                deleteCategory = c;
                break;
            }
        }

        if (deleteCategory != null) {
            categories.remove(deleteCategory);
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không tìm thấy ID!");
        }
    }

    @Override
    public void displayAll() {

        if (categories.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (Category c : categories) {
            c.displayData();
        }
    }
}
