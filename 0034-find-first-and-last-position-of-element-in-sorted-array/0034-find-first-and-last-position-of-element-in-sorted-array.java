class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int l = 0;
        int h = nums.length - 1;
        int bound = -1;

        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] == target) {
                bound = m;
                if (isFirst) {
                    h = m - 1;
                } else {
                    l = m + 1;
                }
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        return bound;
    }
}