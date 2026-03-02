package ex3;

import java.util.Stack;

public class MedicationProcessChecker {

    private Stack<String> stack;

    public MedicationProcessChecker() {
        stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions) {

        for (int i = 0; i < actions.length; i++) {

            String action = actions[i];

            // Nếu là PUSH
            if (action.equalsIgnoreCase("PUSH")) {
                stack.push("MED");
            }

            // Nếu là POP
            else if (action.equalsIgnoreCase("POP")) {

                // Stack rỗng mà pop => sai
                if (stack.isEmpty()) {
                    System.out.println(" Lỗi tại bước " + (i + 1)
                            + ": POP khi Stack đang rỗng!");
                    return false;
                }

                stack.pop();
            }

            // Lệnh không hợp lệ
            else {
                System.out.println(" Lệnh không hợp lệ tại bước "
                        + (i + 1) + ": " + action);
                return false;
            }
        }

        // Sau khi xử lý xong
        if (!stack.isEmpty()) {
            System.out.println("Kết thúc ca trực nhưng Stack chưa rỗng!");
            System.out.println("Còn " + stack.size() + " lần PUSH chưa POP.");
            return false;
        }

        System.out.println(" Quy trình hợp lệ!");
        return true;
    }

    // Reset Stack
    public void reset() {
        stack.clear();
    }
}
