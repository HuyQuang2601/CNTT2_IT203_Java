package baitap;

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
        tinhChuVi();
        tinhDienTich();
    }

    @Override
    public void tinhChuVi() {
        chuVi = 2 * Math.PI * r;
    }

    @Override
    public void tinhDienTich() {
        dienTich = Math.PI * r * r;
    }

    @Override
    public String getInfo() {
        return "Circle - bán kính: " + r +
                ", chu vi: " + chuVi + ", diện tích: " + dienTich;
    }
}