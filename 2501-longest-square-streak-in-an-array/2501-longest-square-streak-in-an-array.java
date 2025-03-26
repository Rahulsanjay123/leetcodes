class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxStreak = 0;
        for (int num : nums) {
            int current = num;
            int streak = 1;
            while (true) {
                long next = (long)current * current;
                if (next > Integer.MAX_VALUE) {
                    break;
                }
                if (set.contains((int)next)) {
                    streak++;
                    current = (int)next;
                } else {
                    break;
                }
            }
            maxStreak = Math.max(maxStreak, streak);
        }
        return maxStreak >= 2 ? maxStreak : -1;
    }
}