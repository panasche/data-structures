package backtracking;

public class n_knights {
    static int knights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        if (row == board.length-1 && col == board.length)
            return count;
        if (col == board.length){
            count+=knights(board,row+1,0,knights);
            return count;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count+=knights(board,row,col+1,knights-1);
            board[row][col] = false;
        }
        count+=knights(board,row,col+1,knights);
        return count;
    }
    static boolean isSafe(boolean[][] board, int row, int col) {
        if (row >= 2) {
            if (col >= 1)
                if(board[row-2][col-1])
                    return false;
            if (col < board.length-1)
                if(board[row-2][col+1])
                    return false;
        }
        if (row >= 1) {
            if (col >= 2)
                if(board[row-1][col-2])
                    return false;
            if (col < board.length-2)
                if(board[row-1][col+2])
                    return false;
        }
        return true;
    }
    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean value : row) {
                if (value) {
                    System.out.print("N ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        System.out.println("Total count: "+knights(board,0,0,3));
    }
}
