class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        
        Arrays.fill(res,-1);
        for(int i=0;i<nums1.length;i++)
        {
            boolean flag = true;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    flag=false;
                }
                if(flag)
                {
                    continue;
                }
                if(nums1[i]<nums2[j])
                {
                    res[i]=nums2[j];
                    break;
                }
            }
        }
        return res;
    }
}