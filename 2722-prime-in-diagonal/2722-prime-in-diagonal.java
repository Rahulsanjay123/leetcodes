class Solution {
    public int diagonalPrime(int[][] nums) 
    {
        int max=0,n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i][i]==1)
            {
                continue;
            }
            if(prime(nums[i][i]))
            {
                max=max>nums[i][i]?max:nums[i][i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i][i]==1)
            {
                continue;
            }
            if(prime(nums[i][n-i-1]))
            {
                max=max>nums[i][n-i-1]?max:nums[i][n-i-1];
            }
        }
        return max;
    }
    public static boolean prime(int a)
    {
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
}