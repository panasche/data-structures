package backtracking.maze;

import java.util.ArrayList;
import java.util.List;

public class path_obstacles {
    static List<String> path(boolean[][] maze, String path, int row, int col) {
        if (row == maze.length-1 && col == maze[0].length-1) {
            List<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        List<String> ans = new ArrayList<>();
        if (!maze[row][col]) {
            return new ArrayList<>();
        }
        maze[row][col] = false;
        if (row > 0) {
            ans.addAll(path(maze,path+"U",row-1,col));
        }
        if (row < maze.length-1) {
            ans.addAll(path(maze,path+"D",row+1,col));
        }
        if (col > 0) {
            ans.addAll(path(maze,path+"L",row,col-1));
        }
        if (col < maze[0].length-1) {
            ans.addAll(path(maze,path+"R",row,col+1));
        }
        maze[row][col] = true;
        return ans;
    }

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(path(maze,"",0,0));
    }
}
