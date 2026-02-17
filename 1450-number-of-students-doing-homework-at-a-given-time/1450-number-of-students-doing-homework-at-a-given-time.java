class Solution {
    public int busyStudent(int[] st, int[] qt, int queryTime) {
        int count=0;
        for(int i=0;i<qt.length;i++)
        {
            if(qt[i]>=queryTime && st[i]<=queryTime )
            {
                count++;
            }
        }
        return count;
    }
}