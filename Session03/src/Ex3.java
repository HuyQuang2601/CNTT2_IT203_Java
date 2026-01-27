public class Ex3 {
    public static void main(String[] args) {

        String[] names = {
                "Python Pro",
                "Web Design",
                "Java Core",
                "Data Structure",
                "Clean Code"
        };

        int[] quantities = {50, 50, 20, 5, 20};

        int max = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        System.out.println("Sách có số lượng nhiều nhất (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println(" - " + names[i]);
            }
        }

        System.out.println("-------------------");

        int min = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }

        System.out.println("Sách có số lượng ít nhất (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println(" - " + names[i]);
            }
        }
    }
}
