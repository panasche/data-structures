package backtracking;

public class n_queens {
    static void queen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board,row,col)) {
                board[row][col] = true;
                queen(board,row+1);
                board[row][col] = false;
            }
        }
    }
    static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i =0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        for (int i = 1; i <= Math.min(row,col); i++) {
            if (board[row-i][col-i]) {
                return false;
            }
        }
        while (row > 0 && col < board.length-1) {
            if (board[--row][++col]) {
                return false;
            }
        }
        return true;
    }
    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            System.out.print("| ");
            for (boolean value : row) {
                if (value) {
                    System.out.print("Q ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        queen(board,0);
    }
}
