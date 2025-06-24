class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
        boolean isBulky = l>=10000 || w>=10000 || h>=10000 || (long)l*w*h>=1000000000L;
        boolean isHeavy = m>=100;

        if (isBulky && isHeavy) return "Both";
        else if (isBulky) return "Bulky";
        else if (isHeavy) return "Heavy";
        else return "Neither";
    }
}