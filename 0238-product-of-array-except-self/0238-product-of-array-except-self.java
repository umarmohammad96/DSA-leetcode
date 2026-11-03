class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 2) return new int[]{nums[1], nums[0]};
        int arr[] = new int[nums.length];
        int mul = 1;
        int zeroCount = 0;
        for(int x : nums){
            if(x == 0){
                zeroCount++;
                continue;
            }
            mul*=x;
        }
        if(zeroCount > 1){
            return arr;
        }
        else if(zeroCount == 1){
            for(int i = 0 ; i < nums.length ; i++){
                if(!(nums[i] == 0)) arr[i] = 0;
                else arr[i] = mul;
            }
        }
        else{
            for(int i = 0 ; i < nums.length ; i++){
                if(!(nums[i] == 0)) {
                    arr[i] = mul/nums[i];
                    continue;
                }
                arr[i] = 0;
            }
        }
        return arr;
    }
}