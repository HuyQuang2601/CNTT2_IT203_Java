package Ex3;

public class Program {
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5};
        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5");

        double avg = ScoreUtils.calculateAverage(scores);

        System.out.println(">> Kết quả xử lý:");
        System.out.println("- Điểm trung bình cả lớp: " + avg);

        for (double s : scores) {
            if (ScoreUtils.checkPass(s)) {
                System.out.println("- Điểm " + s + ": Đạt");
            } else {
                System.out.println("- Điểm " + s + ": Trượt");
            }
        }
    }
}
