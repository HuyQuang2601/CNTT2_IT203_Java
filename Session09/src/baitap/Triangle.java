package baitap;

class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
        tinhChuVi();
        tinhDienTich();
    }

    @Override
    public void tinhChuVi() {
        chuVi = a + b + c;
    }

    @Override
    public void tinhDienTich() {
        double p = chuVi / 2; // công thức Heron
        dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String getInfo() {
        return "Triangle - cạnh a: " + a + ", b: " + b + ", c: " + c +
                ", chu vi: " + chuVi + ", diện tích: " + dienTich;
    }
}