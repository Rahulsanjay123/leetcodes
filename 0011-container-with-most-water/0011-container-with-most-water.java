class Solution {
    public int maxArea(int[] h)
    {
        int l=0,r=h.length-1,area=0,max=0;
        while(l<r)
        {
            area = Math.min(h[l],h[r])*(r-l);
            max = Math.max(max,area);
            if(h[l]<h[r])
            l++;
            else
            r--;
        }
        return max;
    }
}