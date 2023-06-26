package sorting;

import java.util.Arrays;
public class Heap {
    static void build_max_heap(int[] arr){
        for (int i = (arr.length-1)/2; i >= 0; i--){
            max_heapify(arr, arr.length-1, i);
        }
    }

    static void max_heapify (int[] arr, int len, int i) {
        int l = (2*i)+1;
        int r = l+1;
        int largest = i;
        if (l <= len && arr[i] < arr[l])
            largest = l;
        if (r <= len && arr[r] > arr[l])
            largest = r;
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            max_heapify(arr, len, largest);
        }
    }

    static int[] heap_sort(int[] arr){
        build_max_heap(arr);
        int n = arr.length-1;
        while (n>=0){
            int temp = arr[0];
            arr[0] = arr[n];
            arr[n] = temp;
            n--;
            max_heapify(arr, n, 0);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,2,16,9,10,14,8,7};
        System.out.println(Arrays.toString(heap_sort(arr)));
/*
        build_max_heap(arr);
        System.out.println(Arrays.toString(arr));
*/
    }
}
