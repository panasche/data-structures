package recursion;

public class linear_search {
    static int search(int[] arr, int target, int index){
        if (index==arr.length)
            return -1;
        if (arr[index]==target)
            return index;
        return search(arr, target, ++index);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(search(arr, 2, 0));
    }
}
