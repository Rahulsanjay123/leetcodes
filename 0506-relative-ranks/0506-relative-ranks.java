class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = new int[score.length];
        for (int i = 0; i < score.length; i++) 
        {
            arr[i] = score[i];
        }
        Arrays.sort(arr);
        Map<Integer, String> scoreToRank = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (i == arr.length - 1) 
            {
                scoreToRank.put(arr[i], "Gold Medal");
            } 
            else if (i == arr.length - 2) 
            {
                scoreToRank.put(arr[i], "Silver Medal");
            } 
            else if (i == arr.length - 3) 
            {
                scoreToRank.put(arr[i], "Bronze Medal");
            }
            else 
            {
                scoreToRank.put(arr[i], String.valueOf(arr.length - i));
            }
        }
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) 
        {
            result[i] = scoreToRank.get(score[i]);
        }
        return result;
    }
}