package sorting;

import java.util.Arrays;
public class Bubble {
    static int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    arr[j]+=arr[j-1];
                    arr[j-1]=arr[j]-arr[j-1];
                    arr[j]-=arr[j-1];
                    swapped=true;
                }
            }
            if (!swapped)
                break;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
