package string;

public class permutations {
    static void perms(String str, String res) {
        if (str.isEmpty()) {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < res.length() + 1; i++) {
            perms(str.substring(1), res.substring(0,i) + str.charAt(0) + res.substring(i));
        }
    }

    public static void main(String[] args) {
        String str = "1234";
        perms(str, "");
    }
}