class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i],i);
        }

        for(int j = 0 ; j < nums.length ; j++){
            int tar = target-nums[j];
            if(hm.containsKey(tar) && hm.get(tar)!=j){
                return new int[]{j, hm.get(tar)};
            }
        }
        return new int[]{};
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // } return new int[]{};
    }
}