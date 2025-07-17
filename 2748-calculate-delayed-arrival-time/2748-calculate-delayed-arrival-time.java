class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        int s = (a+d)%24;
        return s;
    }
}