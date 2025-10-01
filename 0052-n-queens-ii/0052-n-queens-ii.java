class Solution {
    private int ans = 0;
    public int totalNQueens(int n) {
        dfs(n, 0, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);
        return ans;
    }
    private void dfs(int n, int row, boolean[] cols, boolean[] diag1, boolean[] diag2) {
        if (row == n) {
            ans++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (cols[col] || diag1[row + col] || diag2[col - row + n - 1]) continue;
            cols[col] = diag1[row + col] = diag2[col - row + n - 1] = true;
            dfs(n, row + 1, cols, diag1, diag2);
            cols[col] = diag1[row + col] = diag2[col - row + n - 1] = false;
        }
    }
}
