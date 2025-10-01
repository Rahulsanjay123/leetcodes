class Solution {
    public int jump(int[] nums) {
        int jumps = 0;      // Number of jumps needed
        int currentEnd = 0; // End of the range for the current jump
        int farthest = 0;   // Farthest reachable index so far

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            // If we have reached the end of the current jump range,
            // increase the jump count and update the range
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
                if (currentEnd >= nums.length - 1) break;
            }
        }
        return jumps;
    }
}