class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int mx = Arrays.stream(nums).max().getAsInt();
        int mn = Arrays.stream(nums).min().getAsInt();
        return Math.max(0, mx - mn - 2 * k);
    }
}