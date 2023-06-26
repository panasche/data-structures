package sorting;

import java.util.Arrays;
public class Merge {
    static int[] sort(int[] arr){
        if (arr.length==1)
            return arr;

        int mid = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] left, int[] right){
        int[] arr = new int[left.length+right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                arr[k++] = left[i++];
            } else{
                arr[k++] = right[j++];
            }
        }
        while (i < left.length){
            arr[k++] = left[i++];
        }
        while (j < right.length){
            arr[k++] = right[j++];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
