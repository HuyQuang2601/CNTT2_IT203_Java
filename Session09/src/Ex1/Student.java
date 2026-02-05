package ex1;

public class Student extends Person {

    private String maSV;
    private double diemTB;
    public Student(String hoTen, int tuoi, String maSV, double diemTB) {
        super(hoTen, tuoi); // Gọi constructor lớp cha
        this.maSV = maSV;
        this.diemTB = diemTB;
    }
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin(); // Gọi phương thức lớp cha
        System.out.println("Mã SV: " + maSV);
        System.out.println("Điểm TB: " + diemTB);
    }
}
