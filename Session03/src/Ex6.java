public class Ex6 {
    public static int[] mergeBooks(int[] a, int[] b) {
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                temp[k++] = a[i++];
            } else if (a[i] > b[j]) {
                temp[k++] = b[j++];
            } else {
                temp[k++] = a[i];
                i++;
                j++;
            }
        }

        while (i < a.length) {
            temp[k++] = a[i++];
        }

        while (j < b.length) {
            temp[k++] = b[j++];
        }

        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = temp[x];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.print("Kho cũ: ");
        System.out.print("[ ");
        for (int i = 0; i < arrayFirst.length; i++) {
            System.out.print(arrayFirst[i] + " ");
        }
        System.out.println("]");

        System.out.print("Lô mới: ");
        System.out.print("[ ");
        for (int i = 0; i < arraySecond.length; i++) {
            System.out.print(arraySecond[i] + " ");
        }
        System.out.println("]");

        System.out.print("Kho tổng (đã gộp & lọc trùng): ");
        System.out.print("[ ");
        for (int i = 0; i < arrayMerge.length; i++) {
            System.out.print(arrayMerge[i] + " ");
        }
        System.out.println("]");
    }
}
