import java.util.Arrays;

public class Zadanie5 {
    public static void main(String[] args) {

        int[] intArr = new int[] { 10,20,30 };

        print(intArr);
    }
    static void print(int[]input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if (i < input.length - 1) {
                System.out.print(" ");
            }

        }
    }
    // i++ to jest i = i + 1
}
