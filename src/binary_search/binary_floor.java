package binary_search;

public class binary_floor {
    static int search(int[] arr, int target, int s, int e){
        if (target<arr[0])
            return -1;
        int m = s + (e-s)/2;
        if (s>e)
            return arr[e]; //returning the element, not the index!!!
        if (arr[m]==target)
            return m;
        if (arr[m]<target)
            return search(arr, target, m+1, e);
        else
            return search(arr, target, s, m-1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,3,5,7,8};
        System.out.println(search(arr,9,0,arr.length-1));
    }

}
