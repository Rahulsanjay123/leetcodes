class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)
        {
            return false;
        }
        return num==div(num);
    }
    public static int div(int a)
    {
        int sum=1;
        for(int i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}