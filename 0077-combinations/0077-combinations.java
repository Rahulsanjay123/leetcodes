class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        backtrack(n, k, 1, temp, result);
        return result;
    }

    private void backtrack(int n, int k, int start, List<Integer> temp, List<List<Integer>> result) 
    {
        if (temp.size() == k) 
        {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n; i++) 
        {
            temp.add(i);
            backtrack(n, k, i + 1, temp, result);
            temp.remove(temp.size()-1);
        }
    }
}