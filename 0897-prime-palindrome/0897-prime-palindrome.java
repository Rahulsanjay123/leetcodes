class Solution {
    public int primePalindrome(int n) {
       if (n <= 2) return 2;
        if (n == 3) return 3;

        while (true) {
            if (palin(n) && check(n)) return n;
            n++;
            if (10_000_000 < n && n < 100_000_000) n = 100_000_000; // Skip even-length palindromes
        }
    }

    public static boolean check(int n)
    {
        if (n < 2 || (n % 2 == 0 && n != 2))
         return false;
        for (int i = 3; i * i <= n; i += 2) 
        { 
            if (n % i == 0) 
            return false;
        }
        return true;
    }

    public static boolean palin(int n)
    {
        int original = n, reversed = 0;
        while (n > 0) 
        {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;

    }
}