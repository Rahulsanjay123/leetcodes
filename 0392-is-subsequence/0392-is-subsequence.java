class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0,count=0;
        for(int i=0;i<t.length();i++)
        {
            if(j==s.length())
            {
                break;
            }
            if(s.charAt(j)==t.charAt(i))
            {
                j++;
                count++;
            }
        }
        return count == s.length();
    }
}