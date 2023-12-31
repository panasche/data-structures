package recursion;

import java.util.Arrays;

public class sum_triangle {
    static void triangle(int[] arr) {
        if (arr.length == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] sum_arr = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            sum_arr[i] = arr[i] + arr[i+1];
        }
        triangle(sum_arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        triangle(arr);
    }
}
