package Ex3;

import java.util.ArrayList;
import java.util.List;

public class CommonPatients {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> common = new ArrayList<>();
        for (T item : listA) {
            if (listB.contains(item)) {
                common.add(item);
            }
        }
        return common;
    }

    public static void main(String[] args) {
        List<Integer> listIntA = List.of(101, 102, 105);
        List<Integer> listIntB = List.of(102, 105, 108);
        System.out.println("Test Case 1 Output: " + findCommonPatients(listIntA, listIntB));
        List<String> listStrA = List.of("DN01", "DN02", "DN03");
        List<String> listStrB = List.of("DN02", "DN04");
        System.out.println("Test Case 2 Output: " + findCommonPatients(listStrA, listStrB));
    }
}
