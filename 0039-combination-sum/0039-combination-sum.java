class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> sum = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), sum);
        return sum;
    }

    private void backtrack(int[] can, int target, int start, List<Integer> temp, List<List<Integer>> sum) 
    {
        if (target == 0) 
        {
            sum.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0) return;

        for (int i = start; i < can.length; i++) 
        {
            temp.add(can[i]);
            backtrack(can, target - can[i], i, temp, sum);
            temp.remove(temp.size() - 1);
        }
    }
}