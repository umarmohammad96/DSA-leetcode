class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 1 || k == 0) return false;

        HashSet<Integer> set = new HashSet<>();
        int limit = Math.min(nums.length, k + 1);
        for(int i = 0 ; i < limit ; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        
        if (k >= nums.length) {
            return false;
        }
        
        for(int right  = k+1, left=0; right < nums.length ; right++,left++){
            set.remove(nums[left]);
            if(set.contains(nums[right])) return true;
            set.add(nums[right]);
        }
        return false;
    }
}