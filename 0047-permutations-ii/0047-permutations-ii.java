class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums); // sort to handle duplicates
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>(), results);
        return results;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> results) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // skip used elements
            if (used[i]) continue;

            // skip duplicates: if current num is same as previous and previous is not used in the current branch, skip
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, used, current, results);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
