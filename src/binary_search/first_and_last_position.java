package binary_search;
// for sorted array!!!
import java.util.Arrays;

// leetcode 34
public class first_and_last_position {
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);
        return ans;
    }
    static int search(int[] arr, int target, boolean isFirst) {
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        while (s <= e) {
            int m = s + (e-s)/2;
            if (arr[m] < target) {
                s = m + 1;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                ans = m;
                if (isFirst) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
}
