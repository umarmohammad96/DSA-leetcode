class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        // if(nums.length <= 1) return nums;
        // int left = 0 ;
        // int right = 1;
        // while(left < nums.length && right < nums.length){
        //     while(left < nums.length && nums[left] %2 == 0) left+=2;
        //     while(right < nums.length && nums[right]%2 != 0) right +=2;
        //     if(left < nums.length && right < nums.length){
        //         int temp = nums[left];
        //         nums[left] = nums[right];
        //         nums[right] = temp;
        //         left += 2;
        //         right += 2;
        //     }
        // }
        // return nums;
        int n = nums.length;
        int i = 0,j = n - 1;

        while(i < n && j > 0){
            if(nums[i] % 2 > nums[j] % 2){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[i] % 2 == 0){
                i+=2;
            }
            if(nums[j] % 2 != 0){
                j-=2;
            }
        }

        return nums;
    }
}