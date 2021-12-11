public class Zadanie8 {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 2, 3, 4, 10000, 4, 10};

        System.out.println("Czy ciąg jest niemalejący: " + isIncreasing(arr));
    }

    public static boolean isIncreasing(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return false;
            }
        }

        return true;
    }
}
