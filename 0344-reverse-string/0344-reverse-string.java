class Solution {
    public void reverseString(char[] s) {

        for(int i=0;i<s.length-1-i;i++)
        {
            char c =s[i];
            s[i]=s[s.length-i-1];
            s[s.length-i-1]=c;
        }
    }
}