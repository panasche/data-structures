package binary_search;

public class Rotated_array {
    static int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        int pivot = findPivot(arr);
        if (target < arr[0]) {
            s = pivot+1;
            e = arr.length-1;

        } else {
            e = pivot;
        }
        while (s <= e) {
            int m = s + (e-s)/2;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                s = m+1;
            } else {
                e = m -1;
            }
        }

        return -1;
    }
    static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while (s<e) {
            int m = s + (e-s)/2;
            if (m < arr.length-1 && arr[m] > arr[m=1]) {
                return m;
            } else if (arr[m] > arr[m+1]) {
                e = m;
            } else {
                s = m+1;
            }
        }
        return arr.length-1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,6,7,0,1,2,3,4};
        for (int num : arr) {
            System.out.println(num + " : " + search(arr, num));
        }
    }
}
