class Solution {
    public int numberOfChild(int n, int k) {
        int j = 0;          
        int dir = 1;        
        for (int i = 0; i < k; i++) 
        {
            j += dir;
            if (j == n - 1) 
            {
                dir = -1; 
            } 
            else if (j == 0) 
            {
                dir = 1;   
            }
        }
        return j;
    }
}