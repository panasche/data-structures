package string;

import java.util.ArrayList;
import java.util.List;

public class subsets_duplicate_2 {
    static List<List<Integer>> subs(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                if (!outer.contains(internal)) {
                    outer.add(internal);
                }
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(subs(arr));
    }
}
