class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int f = 0, g = 1;
        for (int i = 2; i <= n; i++) 
        {
            int temp = f + g;
            f = g;
            g = temp;
        }
        return g;
    }
}