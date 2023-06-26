package recursion;

import java.util.ArrayList;
import java.util.List;

public class dice_sum {
    static List<String> dice(int n, String res) {
        if (n == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(res);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= n; i++) {
            ans.addAll(dice(n - i, res+i));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(dice(4,""));
    }
}
