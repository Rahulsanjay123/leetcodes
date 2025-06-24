class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++)
        {
            if(sum(i)%2==0)
            {
                count++;
            }
        }
        return count;
    }
    public static int sum(int a)
    {
        int sum=0;
        while(a!=0)
        {
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
}