package recursion;

public class sum_natural_numbers {
    public static int sum(int num){
        if(num==0)
            return num;
        return num + sum(--num);
    }
    public static void main(String[] args) {

        System.out.println(sum(5));
    }
}