class Solution {
    public int commonFactors(int a, int b) {
        if(a==0||b==0)return 0;
        int c=0;
        int g=(a<b?a:b);
        for(int i=1;i<=g;i++)
        {
            if(a%i==0 && b%i==0)
            {
                c++;
            }
        }
        return c;
    }
}