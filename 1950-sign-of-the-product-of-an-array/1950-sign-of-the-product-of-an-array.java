class Solution {
    public int arraySign(int[] nums) {
        int c=0;
        for(int num:nums)
        {
            if(num<0)
            {
                c++;
            }
            else if(num==0)
            {
                return 0;
            }
        }
        return c%2==0?1:-1;
    }
}