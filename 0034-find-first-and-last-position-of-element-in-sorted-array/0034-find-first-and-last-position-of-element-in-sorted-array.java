class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findBound(nums, target, true);
        int end = findBound(nums, target, false);
        return new int[] {start, end};
    }

    private int findBound(int[] nums, int target, boolean isFirst) 
    {
        int left = 0, right = nums.length - 1;
        int bound = -1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) 
            {
                left = mid + 1;
            } 
            else if (nums[mid] > target) 
            {
                right = mid - 1;
            } 
            else 
            {
                bound = mid;
                if (isFirst) 
                {
                    right = mid - 1; 
                } 
                else 
                {
                    left = mid + 1; 
                }
            }
        }
        return bound;
    }
}