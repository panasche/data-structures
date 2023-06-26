package backtracking;

public class sudoku_solver {
    static boolean sudoku(int[][] board) {
        boolean empty = true;
        int row = 0;
        int col = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    empty = false;
                    break;
                }
            }
            if (!empty) {
                break;
            }
        }
        if (empty) {
            return true;
        }
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board,row,col,i)) {
                board[row][col] = i;
                if (sudoku(board)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] ==  num) {
                return false;
            }
        }
        for (int[] line : board) {
            if (line[col] == num) {
                return false;
            }
        }
        int center_r = (row/3) * 3 + 1;
        int center_c = (col/3) * 3 + 1;
        for (int i = center_r-1; i <= center_r+1; i++) {
            for (int j = center_c-1; j <= center_c+1; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
