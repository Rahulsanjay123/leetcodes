class Solution {
    public int numWaterBottles(int nb, int ne) {
       int total = nb;
        int empties = nb;
        while (empties >= ne) {
            int newBottles = empties / ne;
            total += newBottles;
            empties = newBottles + (empties % ne);
        }
        return total;
    }
}