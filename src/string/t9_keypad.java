package string;

import java.util.ArrayList;
import java.util.List;

public class t9_keypad {
    static List<String> combination(String digits, String res) {
        if (digits.isEmpty()) {
            ArrayList<String > list = new ArrayList<>();
            list.add(res);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        int digit = digits.charAt(0) - '0';
        int i = (digit-2) * 3;

        if (digit > 7)
            i+=1;
        int len = i + 3;
        if (digit == 7 || digit == 9) {
            for (; i <= len; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(combination(digits.substring(1), res + ch));
            }
        } else {
            for (; i < len; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(combination(digits.substring(1), res + ch));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "2";
        System.out.println(combination(str,""));
    }
}
