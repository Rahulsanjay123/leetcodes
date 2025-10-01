class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        
        int start = nums[0];

        for (int i = 0; i < nums.length; i++) {
            // Check if we reached the end or if the next number is not consecutive
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
                if (start == nums[i]) {
                    // Single number range
                    result.add(String.valueOf(start));
                } else {
                    // Multiple number range
                    result.add(start + "->" + nums[i]);
                }
                if (i < nums.length - 1) {
                    start = nums[i + 1];
                }
            }
        }
        
        return result;
    }
}