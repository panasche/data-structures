package binary_search;
// number of occurrences of `k` in a sorted array...
public class no_of_occurrences {
    static int count(int[] arr, int k) {
        int f_index = index(arr,k,true);
        if (f_index == -1) {
            return 0;
        }
        int l_index = index(arr,k,false);
        return l_index - f_index + 1;
    }
    static int index(int[] arr, int k, boolean checkingFirst) {
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        while (s <= e) {
            int m = s + (e-s)/2;
            if (arr[m] < k) {
                s = m + 1;
            } else if (arr[m] > k) {
                e = m - 1;
            } else {
                ans = m;
                if (checkingFirst) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5};
        System.out.println(count(arr,5));
    }
}
