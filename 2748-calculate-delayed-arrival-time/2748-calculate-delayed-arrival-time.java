class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        int s = a+d;
        return s==24? 0:((s>24)?(s-24):s);
    }
}