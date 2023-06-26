package dp;

public class min_sum_subarray {
    static int minSum(int[] arr) {
        if (arr.length == 0)
            return 0;
        int minSum = Integer.MAX_VALUE;
        int minLast = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currSum = Math.min(arr[i], arr[i] + minLast);
            minLast = currSum;
            minSum = Math.min(currSum, minSum);
        }
        return minSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 1, 4};
        System.out.println(minSum(arr));
    }
}
