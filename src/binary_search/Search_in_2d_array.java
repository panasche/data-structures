package binary_search;

import java.util.Arrays;
public class Search_in_2d_array {
    static int[] search(int[][] arr, int target) {
        int row = 0;
        int column = arr.length-1;

        while (row < arr.length && column >= 0) {
            if (arr[row][column] < target) {
                row++;
            } else if (arr[row][column] > target) {
                column--;
            } else {
                return new int[]{row,column};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr, 10)));
    }
}
