class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        // for (int i : nums) {
        //     sum += i;
        // }
         sum = Arrays.stream(nums).sum();
        return sum % k;
    }
}