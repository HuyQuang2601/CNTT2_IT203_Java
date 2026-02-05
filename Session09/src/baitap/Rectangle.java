package baitap;

class Rectangle extends Shape {
    private double chieuDai;
    private double chieuRong;

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        tinhChuVi();
        tinhDienTich();
    }

    @Override
    public void tinhChuVi() {
        chuVi = 2 * (chieuDai + chieuRong);
    }

    @Override
    public void tinhDienTich() {
        dienTich = chieuDai * chieuRong;
    }

    @Override
    public String getInfo() {
        return "Rectangle - dài: " + chieuDai + ", rộng: " + chieuRong +
                ", chu vi: " + chuVi + ", diện tích: " + dienTich;
    }
}