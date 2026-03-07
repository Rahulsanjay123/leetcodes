class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        char a = '}';
        for(int i=0;i<n;i++)
        {
            if(letters[i]>target)
            {
                if(letters[i]<a)
                {
                    a=letters[i];
                }
            }
        }
        if(a=='}')
        {
            a=letters[0];
        }
        return a;
    }
}