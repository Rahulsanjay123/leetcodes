class Solution {
    public int differenceOfSum(int[] nums) 
    {
        int s1=0,s2=0;
        for(int num:nums)
        {
            s1+=num;
            if(num>9)
            {
                s2+=sum(num);
            }
            else
            {
                s2+=num;
            }
        }
        return s1-s2;
        
    }
    public static int sum(int a)
    {
        int sum=0;
        while(a!=0)
        {
            sum=sum+(a%10);
            a/=10;
        }
        return sum;
    }
}