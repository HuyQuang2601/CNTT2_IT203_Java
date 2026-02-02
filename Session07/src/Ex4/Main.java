package Ex4;

public class Main {

    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("An");
        ClassRoom sv2 = new ClassRoom("Bình");
        ClassRoom sv3 = new ClassRoom("Chi");

        sv1.payFund(50000);
        sv2.payFund(70000);
        sv3.payFund(30000);

        System.out.println();
        ClassRoom.showClassFund();
    }
}
