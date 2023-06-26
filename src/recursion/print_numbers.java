package recursion;

public class print_numbers {
    static void print1(int n){
        if (n==0)
            return;
        print1(n-1);
        System.out.print(n);
    }
    static void print2(int n){
        if(n==0)
            return;
        System.out.print(n);
        print2(--n);
    }
    public static void main(String[] args) {
        print1(5);
        print2(5);
    }
}
