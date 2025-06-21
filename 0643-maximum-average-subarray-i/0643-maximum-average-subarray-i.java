class Solution 
{
    public double findMaxAverage(int[] nums, int k) 
    {
        int sum=0,max=0,n=nums.length;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        max=sum;
        for(int i=k;i<n;i++)
        {
            sum=sum-nums[i-k]+nums[i];
            if(sum>max)
            {
                max=sum;
            }
        }
        return (double)max/k;
    }
}