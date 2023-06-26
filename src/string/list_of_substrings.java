package string;

import java.util.ArrayList;

public class list_of_substrings {
    static ArrayList<String> subs(String str, String res) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }
        ArrayList<String> left = subs(str.substring(1), res + str.charAt(0));
        ArrayList<String> right = subs(str.substring(1), res);

        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subs(str, ""));
    }
}
