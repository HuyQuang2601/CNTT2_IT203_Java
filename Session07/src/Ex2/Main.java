package Ex2;

public class Main {
    public static void main(String[] args) {

        double d1 = 7.5;
        double d2 = 6.0;
        double d3 = 8.0;

        double avg = ScoreUtils.calculateAverage(d1, d2, d3);

        System.out.println("Điểm trung bình: " + avg);

        if (ScoreUtils.isPass(avg)) {
            System.out.println("Kết quả: Đạt");
        } else {
            System.out.println("Kết quả: Không đạt");
        }
    }
}
