class Solution {
    public int diagonalPrime(int[][] nums) 
    {
        int max = 0;
        int n = nums.length;
        for(int i = 0 ; i < n; i++)
        {
            if(nums[i][i] > max && isPrime(nums[i][i]))
            {
                max = nums[i][i];
            }
            if(nums[i][n-1-i] > max && isPrime(nums[i][n-1-i]))
            {
                max = nums[i][n-1-i];
            }
        }
        return max;
    }
    private boolean isPrime(int n)
    {
        if(n < 2)  return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) return false;
        }
        return true;
    }
}