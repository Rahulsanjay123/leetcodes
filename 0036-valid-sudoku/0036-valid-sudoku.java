class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
        Set<Character> rows = new HashSet<>();
        Set<Character> cols = new HashSet<>();
        Set<Character> cube = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            if (board[i][j] != '.' && !rows.add(board[i][j])) return false;
            if (board[j][i] != '.' && !cols.add(board[j][i])) return false;
            int rowIdx = 3 * (i / 3), colIdx = 3 * (i % 3);
            char c = board[rowIdx + j / 3][colIdx + j % 3];
            if (c != '.' && !cube.add(c)) return false;
        }
    }
    return true;
    }
}