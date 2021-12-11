import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {

        int[] intArr = new int[] { 1,2,3 };
        System.out.println(Arrays.toString(intArr));


    }
    public static int[]revert(int[]arr){
        int[] tab = new int[arr.length];
        for (int i = 0; i< arr.length; i++)
            tab[arr.length - i-1]= arr[i];
        return tab;
            }
        }


