class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0 ;
        int sumOfsubArrays = 0;
         int preSum = 0 ;
        int count = 0;
    
        for(int i = 0 ; i < nums.length ; i++){
           
            if(nums[i]%2 != 0){
                 count++;
                 preSum = 0;
            }
            while(count == k){
                preSum++;
                if(nums[left]%2 != 0){
                    count--;
                }
                left++;
            }
            sumOfsubArrays += preSum;
        }
        return sumOfsubArrays;
    }
}