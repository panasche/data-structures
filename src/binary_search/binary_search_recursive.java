package binary_search;
// order agnostic binary search
public class binary_search_recursive {
    static int search(int[] arr, int target, int s, int e){
        boolean isAsc = arr[0]<arr[arr.length-1];
        if (s>e)
            return -1;
        int m=s+(e-s)/2;
        if (target==arr[m])
            return m;
        if (isAsc){
            if (target<arr[m])
                return search(arr, target, s, m-1);
            return search(arr, target, m+1, e);
        }
        else{
            if (target<arr[m])
                return search(arr, target, m+1, e);
            return search(arr, target, s, m-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,7,6,5,4,3,2,};
        System.out.println(search(arr, 6, 0, arr.length-1));
    }
}
