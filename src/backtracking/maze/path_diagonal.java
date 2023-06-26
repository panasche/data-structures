package backtracking.maze;

import java.util.ArrayList;
import java.util.List;

public class path_diagonal {
    static List<String> diag_path(String path, int row, int col) {
        if (row == 1 && col == 1) {
            List<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if (row > 1) {
            ans.addAll(diag_path(path + "D",row-1,col));
        }
        if (col > 1) {
            ans.addAll(diag_path(path + "R",row,col-1));
        }
        if (row > 1 && col > 1) {
            ans.addAll(diag_path(path + "X",row-1,col-1));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(diag_path("",3,3));
    }
}
