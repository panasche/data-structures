package backtracking.maze;

import java.util.ArrayList;
import java.util.List;

public class print_paths {
    static List<String> print(String path, int row, int col) {
        if (row == 1 && col == 1){
            List<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (row > 1) {
            List<String> down = print(path + "D",row-1,col);
            ans.addAll(down);
        }
        if (col > 1) {
            List<String> right = print(path + "R",row,col-1);
            ans.addAll(right);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(print("",1,2));
    }
}
