package recursion;

public class count_zeroes {
    static int c=0;
    static int zCount(int n){
        int rem=n%10;
        if (n==0)
            return c;
        if (rem==0)
            c++;
        zCount(n/10);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(zCount(21010101));
    }
}
