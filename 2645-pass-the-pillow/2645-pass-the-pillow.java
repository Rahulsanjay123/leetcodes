class Solution {
    public int passThePillow(int n, int time) {
       int pos = 1;
        int direction = 1; 
        for (int i = 0; i < time; i++) 
        {
            pos += direction;
            if (pos == n || pos == 1) 
            {
                direction *= -1; 
            }
        }

        return pos;

    }
}