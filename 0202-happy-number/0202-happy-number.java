class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
        }
        
        return n == 1;
    }
    public static int sumOfSquares(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r = n%10;
            sum +=r*r;
            n=n/10;
        }
        return sum;
    }
}