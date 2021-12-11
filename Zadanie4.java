import java.util.Arrays;

public class Zadanie4 {
    // Driver code
    public static void main(String[] args) {
        int arr1[] = {5, 6, 7};
        int arr2[] = {10, 20, 30};

        if (areEqual(arr1, arr2))
            System.out.println("True");
        else
            System.out.println("False");

//        System.out.println(areEqual(arr1, arr2)); // można zapisać to w jednej linii
    }

    public static boolean areEqual(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        // If lengths of array are not equal means
        // array are not equal
        if (n != m)
            return false;

        // [10, 20, -5, 7] -> [-5, 7, 10, 20]
        // [-5, 20, 7, 10] -> [-5, 7, 10, 20]


        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Linearly compare elements
        for (int i = 0; i < n; i++)
            if (arr1[i] != arr2[i])
                return false;

        // If all elements were same.
        return true;
    }


}

