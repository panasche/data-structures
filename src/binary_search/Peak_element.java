package binary_search;

public class Peak_element {
    static int findPeakElement(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int m = s + (e-s)/2;
            if(nums[m]>nums[m+1]){
                e=m;
            } else{
                s=m+1;
            }
        }
        return s; // both s and e at peak element
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }
}
