class Solution {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
          if (needle.isEmpty()) 
          return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) 
        {
            if (check(needle, haystack.substring(i, i + needle.length())))
            {
                return i;
            }
        }
        return -1;
    }

    public static boolean check(String a,String b)
    {
        return a.equals(b);
    }
}