package dp;

public class finbonacci {
    static int fib(int n) {
        int[] memo = new int[n+1];
        int f = 0;
        if (memo[n] != 0) {
            return memo[n];
        }
        if (n <= 1) {
            f = n;
        } else {
            f = fib(n-1) + fib(n-2);
        }
        memo[n] = f;
        return f;
    }

    public static void main(String[] args) {
        System.out.println("Memo-");
        long preTime = System.currentTimeMillis();
        for (int i = 0; i < 45; i++) {
            System.out.print(fib(i) + " ");
        }
        long postTime = System.currentTimeMillis();
        System.out.println("\nTime taken to compute in milliseconds: " + (postTime-preTime));
    }
}
