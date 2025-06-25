class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++)
        {
            if(sum(i)%t==0)
            {
                return i;
            }
        }
        return n;
    }
    public static int sum(int a)
    {
        int s=1;
        while(a!=0)
        {
            s*=a%10;
            a/=10;
        }
        return s;
    }
}