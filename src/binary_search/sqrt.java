package binary_search;
// not done!!!
public class sqrt {
    static int mySqrt(int x){
        if (x==1)
            return 1;
        int s = 0;
        int e = x/2;
        while (s <= e){
            int m = s + (e - s)/2;
            if (m*m <= x && ((m+1)*(m+1)) > x) {
                return m;
            } else if (m*m > x) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

}
