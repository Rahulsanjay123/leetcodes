class Solution {
    public int maximumLength(int[] nums) {
        int[][] dp = new int[2][2]; 
        int maxLen = 0;
        for (int x : nums) 
        {
            int p = x % 2;
            for (int y = 0; y < 2; ++y) 
            {
                dp[p][y] = dp[y][p] + 1;
                maxLen = Math.max(maxLen, dp[p][y]);
            }
        }
        return maxLen;
    }
}