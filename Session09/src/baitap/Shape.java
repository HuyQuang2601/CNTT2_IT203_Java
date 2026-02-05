package baitap;

abstract class Shape {
    protected double chuVi;
    protected double dienTich;
    public abstract void tinhChuVi();
    public abstract void tinhDienTich();
    public double getChuVi() {
        return chuVi;
    }
    public double getDienTich() {
        return dienTich;
    }
    public abstract String getInfo(); // để in thông tin chi tiết
}