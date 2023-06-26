package recursion;

public class sorted_array {
    static boolean sorted(int[] arr, int index){
        if (index == arr.length-1)
            return true;
        return arr[index] < arr[index + 1] && sorted(arr, ++index);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2,5};
        System.out.println(sorted(arr, 0));
    }
}
