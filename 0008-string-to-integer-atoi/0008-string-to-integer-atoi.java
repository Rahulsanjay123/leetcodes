class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int i = 0, sign = 1, n = s.length();
        long num = 0;

        if (s.charAt(i) == '+' || s.charAt(i) == '-') 
        {
            sign = s.charAt(i++) == '-' ? -1 : 1;
        }

        while (i < n && Character.isDigit(s.charAt(i)))
        {
            num = num * 10 + (s.charAt(i++) - '0');

            if (sign * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }

        return (int) (sign * num);
    }
}