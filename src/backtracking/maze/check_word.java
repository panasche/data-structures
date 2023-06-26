package backtracking.maze;

class check_word {
    static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m*n; i++) {
            if (board[i/n][i%n] == word.charAt(0) && search(board,word,"",i/n,i%n)) {
                return true;
            }
        }
        return false;
    }
    static boolean search(char[][] board, String word, String str, int row, int col) {
        if (row < 0 || row > board.length-1 || col < 0 || col > board[0].length-1 || board[row][col] == '-') {
            return false;
        }

        str+= board[row][col];

        if (str.equals(word)) {
            return true;
        }
        if (str.length() > word.length()) {
            str = str.substring(0,str.length()-1);
            return false;
        }
        if (!str.equals(word.substring(0, str.length()))) {
            str = str.substring(0,str.length()-1);
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '-';

        boolean ans = search(board, word, str, row+1, col) ||
                search(board, word, str, row, col+1) ||
                search(board, word, str, row-1, col) ||
                search(board, word, str, row, col-1);
        board[row][col] = temp;
        return ans;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(exist(board,"SEE"));
        for (char[] arr : board) {
            for (char ch : arr) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
