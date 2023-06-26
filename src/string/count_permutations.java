package string;

import java.util.ArrayList;

public class count_permutations {
    static int perms(String str, String res) {
        if (str.isEmpty()) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < res.length() + 1; i++) {
            count+=perms(str.substring(1), res.substring(0,i) + str.charAt(0) + res.substring(i));
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(perms(str, ""));
    }
}
