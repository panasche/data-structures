package recursion;

public class factorial {
    public static int fact(int n){
        if(n==0)
            return 1;
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println(fact(i));
        }
    }
}
