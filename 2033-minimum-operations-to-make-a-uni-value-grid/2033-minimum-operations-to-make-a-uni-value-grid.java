class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> nums = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums.add(grid[i][j]);
            }
        }
        
        Collections.sort(nums);
        int median = nums.get(nums.size() / 2);
        
        int operations1 = 0;
        int operations2 = 0;
        boolean possible1 = true;
        boolean possible2 = true;
        
        for (int num : nums) {
            int diff = Math.abs(num - median);
            if (diff % x != 0) {
                possible1 = false;
                break;
            }
            operations1 += diff / x;
        }
        
        if (nums.size() % 2 == 0) {
            int median2 = nums.get(nums.size() / 2 - 1);
            for (int num : nums) {
                int diff = Math.abs(num - median2);
                if (diff % x != 0) {
                    possible2 = false;
                    break;
                }
                operations2 += diff / x;
            }
        } else {
            possible2 = false;
        }
        
        if (!possible1 && !possible2) {
            return -1;
        } else if (possible1 && possible2) {
            return Math.min(operations1, operations2);
        } else if (possible1) {
            return operations1;
        } else {
            return operations2;
        }
    }
}