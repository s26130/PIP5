public class Zadanie6 {
    public static void main(String[] args) {
        double[] arr = new double[] {2.0, 10, -50.12};
        System.out.println("Czy zawiera: " + isInArray(arr, 10.5));
    }

    public static boolean isInArray(double[] arr, double num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }

        return false;
    }
}
