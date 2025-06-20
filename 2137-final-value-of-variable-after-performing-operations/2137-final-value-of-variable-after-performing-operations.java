class Solution {
    public int finalValueAfterOperations(String[] ops) {
        int x=0;
        for(String s : ops)
        {
            for(char ch : s.toCharArray())
            {
                if(ch=='+')
                {
                    x++;
                    break;
                }
                else if(ch=='-')
                {
                    x--;
                    break;
                }
            }
        }
        return x;
    }
}