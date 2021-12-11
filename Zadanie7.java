public class Zadanie7 {

    public static void main(String[] args) {
        double[] arr = new double[] {8, 10.5, -3.5, 1};

        System.out.println("średnia liczb to: " + getAlgebraicMean(arr));
    }
    public static double getAlgebraicMean(double[] arr){
        int howManyNumbers = arr.length; // ???
        double sum = 0; // ???

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            // sum += arr[i]
        }


        return sum / howManyNumbers;
    }
}
