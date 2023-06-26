package sorting;

import java.util.Arrays;
public class Selection {
    static int[] sort(int[] arr){
        for (int i=0; i < arr.length-1; i++){
            int min= arr[i], minIndex=i;
            for (int j=i; j < arr.length; j++){
                if (arr[j]<min)
                    minIndex=j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
