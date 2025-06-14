class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,a=nums.length;
        for(int j=0;j<a;j++)
        {
            if (nums[j]!=0) 
            {
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
            }
        }
    }
}