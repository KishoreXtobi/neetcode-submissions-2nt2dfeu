class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            boolean[] colCheck = new boolean[9];
            boolean[] boxCheck = new boolean[9];
            
            for (int j = 0; j < 9; j++) {
                char x = board[i][j];
                if (x != '.') {
                    if (rowCheck[x - '1']) return false;
                    rowCheck[x - '1'] = true;
                }
                
                char y = board[j][i];
                if (y != '.') {
                    if (colCheck[y - '1']) return false;
                    colCheck[y - '1'] = true;
                }
                
                int boxRow = 3 * (i / 3) + j / 3;
                int boxCol = 3 * (i % 3) + j % 3;
                char z = board[boxRow][boxCol];
                if (z != '.') {
                    if (boxCheck[z - '1']) return false;
                    boxCheck[z - '1'] = true;
                }
            }
        }
        return true;
    }
}