package recursion;

public class sum_array_elements {
    public static int arraySum(int[] arr, int l){
        if(l<=0)
            return 0;
        return arr[l-1] + arraySum(arr, l-1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(arraySum(arr,5));
    }
}
