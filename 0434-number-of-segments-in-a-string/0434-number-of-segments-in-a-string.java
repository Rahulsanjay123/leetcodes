class Solution {
    public int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            // A new segment starts when we see a non-space character
            // that is either at the beginning or preceded by a space
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) 
            {
                count++;
            }
        }
        return count;
    }
}