class Solution {
    public int addDigits(int num) {
        while(num>9)
        {
            num = add(num);
        }
        return num;
    }
    public static int add(int n)
    {
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }
}