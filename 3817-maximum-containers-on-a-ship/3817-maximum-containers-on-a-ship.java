class Solution {
    public int maxContainers(int n, int w, int maxWeigh) {
        for(int i=n*n;i>0;i--)
        {
            if(i*w<=maxWeigh)
            {
                return i;
            }
        }
        return 0;
    }
}