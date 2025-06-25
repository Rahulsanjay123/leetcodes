class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while (mainTank >= 5 && additionalTank > 0) 
        {
            int fuelUsed = 5;
            mainTank -= fuelUsed;
            mainTank += 1;
            additionalTank--;
            distance += fuelUsed * 10;
        }
        distance += mainTank * 10;
        return distance;

    }
}