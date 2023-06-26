package recursion;

public class reverse_number {
    static int res=0;
    static int reverse(int n){
        if(n==0)
            return -1;
        res = (res*10) + (n%10);
        reverse(n/10);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1357));
    }
}
