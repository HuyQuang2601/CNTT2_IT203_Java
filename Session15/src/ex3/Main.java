package ex3;

public class Main {

    public static void main(String[] args) {

        MedicationProcessChecker checker =
                new MedicationProcessChecker();

        String[] test1 = {
                "PUSH", "PUSH", "POP", "PUSH", "POP", "POP"
        };

        System.out.println("Test 1:");
        checker.checkProcess(test1);

        checker.reset();
        System.out.println();

        String[] test2 = {
                "PUSH", "POP", "POP"
        };

        System.out.println("Test 2:");
        checker.checkProcess(test2);

        checker.reset();
        System.out.println();

        // Test 3: Chưa pop hết
        String[] test3 = {
                "PUSH", "PUSH", "POP"
        };

        System.out.println("Test 3:");
        checker.checkProcess(test3);
    }
}