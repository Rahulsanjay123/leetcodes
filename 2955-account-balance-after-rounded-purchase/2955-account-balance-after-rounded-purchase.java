class Solution {
    public int accountBalanceAfterPurchase(int pa) {
        return 100-((int) Math.round((double)pa/10) *10);
    }
}