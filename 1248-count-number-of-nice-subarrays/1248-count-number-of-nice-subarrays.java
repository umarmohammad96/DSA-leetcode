class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int subArraysCount = 0;
        int left = 0 ;
        int count = 0;
        int prefixCount = 0;
        for(int right = 0 ; right < nums.length ; right++){
            if(!(nums[right]%2 == 0)){
                count++;
                prefixCount = 0;
            }
            while(count == k){
                prefixCount++;
                
                if((nums[left]%2 != 0)){
                    count--;
                }
                left++;
            }
            subArraysCount += prefixCount;
        }
        return subArraysCount;

    //    for(int i = 0 ; i < nums.length  ; i++){
    //         int count = 0;
    //         for(int j = i ; j < nums.length ; j++){
    //             if(!(nums[j] % 2 ==0)){
    //                 count++;
    //             }
    //         if(count == k){
    //             subArraysCount++;
    //         }
    //         else if (count > k) break;
    //         }
    //    }
    //    return subArraysCount;
    }
}