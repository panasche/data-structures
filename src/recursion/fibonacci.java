package recursion;

public class fibonacci {
    public static int fib(int n){
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        long preTime = System.currentTimeMillis();
        for (int i = 0; i < 45; i++) {
            System.out.print(fib(i) + " ");
        }
        long postTime = System.currentTimeMillis();
        System.out.println("\nTime taken to compute in milliseconds: " + (postTime-preTime));
    }
}
