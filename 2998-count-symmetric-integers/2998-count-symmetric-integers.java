class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int num = low; num <= high; num++) 
        {
            String s = String.valueOf(num);
            if (s.length() % 2 == 0) 
            {
                int mid = s.length() / 2;
                int sum1 = 0, sum2 = 0;
                for (int i = 0; i < mid; i++) 
                {
                    sum1 += s.charAt(i) - '0';
                    sum2 += s.charAt(i + mid) - '0';
                }
                if (sum1 == sum2) 
                {
                    count++;
                }
            }
        }
        return count;
    }
}