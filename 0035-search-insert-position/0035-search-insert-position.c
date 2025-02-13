int searchInsert(int* nums, int numsSize, int target) 
{
    int i,s;
    if(target>nums[numsSize-1])
    {
        s=numsSize;
    }
    else if(target<nums[0] || target==nums[0])
    {
        s=0;
    }
    else
    {
        for(i=0;i<numsSize-1;i++)
        {
            if(target>=nums[i] && target<=nums[i+1])
            {
                s=i+1;
                break;
            }
        }
    }
    return s;
}