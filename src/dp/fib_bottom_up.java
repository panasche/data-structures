package dp;

public class fib_bottom_up {
    static int fib(int n) {
        int[] fib = new int[n+1];
        int f = 0;

        for (int i = 0; i <= n; i++) {
            if (i <= 1)
                f = i;
            else {
                f = fib[i-2] + fib[i-1];
            }
            fib[i] = f;
        }
        return fib[n];
    }
    public static void main(String[] args) {
        System.out.println("Bottom_up");
        long preTime = System.currentTimeMillis();
        for (int i = 0; i < 45; i++) {
            System.out.print(fib(i) + " ");
        }
        long postTime = System.currentTimeMillis();
        System.out.println("\nTime taken to compute in milliseconds: " + (postTime-preTime));
    }
}
