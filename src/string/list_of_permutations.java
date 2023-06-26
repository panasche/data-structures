package string;

import java.util.ArrayList;

public class list_of_permutations {
    static ArrayList<String> perms(String str, String res) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < res.length() + 1; i++) {
            ans.addAll(perms(str.substring(1), res.substring(0,i) + str.charAt(0) + res.substring(i)));
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "ab";
        System.out.println(perms(str, ""));
    }
}
