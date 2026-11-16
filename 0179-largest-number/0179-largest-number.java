import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String order1 = String.valueOf(nums[j]) + String.valueOf(nums[j + 1]);
                String order2 = String.valueOf(nums[j + 1]) + String.valueOf(nums[j]);

                if (order2.compareTo(order1) > 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        if (nums[0] == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder("");
        for(int x : nums) sb.append(Integer.toString(x));
        return sb.toString();
    }
}