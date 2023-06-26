package binary_search;

import java.util.Arrays;

// applying binary search on the 1D array and mapping it to 2D...
public class sorted_2d_array {
    static int[] search(int[][] arr, int target) {
        int s = 0;
        int e = arr.length * arr[0].length - 1;
        while (s <= e) {
            int m = s + (e-s)/2;
            int row = m / arr[0].length;
            int col = m % arr.length;
            if (arr[row][col] == target) {
                return new int[]{row, col};
            } else if (arr[row][col] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {0,1,2,3},
                {4,5,6,7},
                {8,9,10,11},
                {12,13,14,15}
        };
        for (int[] array : arr) {
            for (int num : array) {
                System.out.println(num + " : " + Arrays.toString(search(arr, num)));
            }
        }
    }
}
