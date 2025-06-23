class Solution {
    public String convertToBase7(int num) {
        if(num==0)return "0";
        String str="";
        int s = num;
        num=Math.abs(num);
        while(num!=0)
        {
            str=num%7+str;
            num/=7;
        }
        return s<0?("-"+str):str;
    }
}