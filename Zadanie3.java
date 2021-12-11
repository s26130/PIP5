public class Zadanie3 {

    public static int[] evens(int[] arr) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                length++;
            }
        }

        int[] result = new int[length];
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                result[number++] = arr[i];
            }
        }
        return result;
    }
}
