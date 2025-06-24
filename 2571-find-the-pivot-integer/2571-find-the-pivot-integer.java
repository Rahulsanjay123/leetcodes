class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;

        for (int x = 1; x <= n; x++) 
        {
            int leftSum = x * (x + 1) / 2;
            int rightSum = totalSum - (x * (x - 1) / 2);

            if (leftSum == rightSum) 
            {
                return x;
            }
        }
        return -1;
    }
}