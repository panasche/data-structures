package binary_search;
// order-agnostic
public class binary_search_iterative {
    static int search(int[] arr, int target){
        boolean isAsc = arr[0]<arr[arr.length-1];
        int s=0;
        int e=arr.length-1;

        while (s<=e){
            int m=s+(e-s)/2;
            if (arr[m]==target)
                return m;
            if (isAsc){
                if (arr[m]<target)
                    s = m + 1;
                if (arr[m]>target)
                    e=m-1;
            }
            else{
                if (arr[m]<target)
                    e = m - 1;
                if (arr[m]>target)
                    s = m + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,7,6,5,4,3,2,};
        System.out.println(search(arr, 6));
    }
}
