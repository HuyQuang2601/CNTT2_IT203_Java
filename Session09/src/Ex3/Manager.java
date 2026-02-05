package ex3;

public class Manager extends Employee {

    private String phongBan;
    // Constructor dùng super()
    public Manager(String ten, double luongCoBan, String phongBan) {

        // BẮT BUỘC là dòng đầu tiên
        super(ten, luongCoBan);

        this.phongBan = phongBan;
    }
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin(); // Gọi hàm cha
        System.out.println("Phòng ban: " + phongBan);
    }
}
