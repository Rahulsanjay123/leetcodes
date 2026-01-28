class Solution {

    private int helper(int[] nums, int k){
        int slow=0,sum=0,count=0;
        for(int fast=0; fast<nums.length;fast++){
            sum+=nums[fast];
            while(sum>k){
                sum-=nums[slow];
                slow++;
            }
            count+=(fast-slow+1);
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return goal==0?helper(nums,goal):(helper(nums,goal)-helper(nums,goal-1));
    }
}