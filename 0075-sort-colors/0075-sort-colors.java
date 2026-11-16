class Solution {
    public void swapOf(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void sortColors(int[] nums) {
        // nums.sort((a,b) -> Integer.compare(a,b));
        int l = 0 ; 
        int m = 0;
        int h = nums.length-1;
        while(m<=h){
            if (nums[m] == 0){
                swapOf(nums, m, l);
                l++;
                m++;
            }
            
            else if(nums[m] == 2){
                swapOf(nums, m, h);
                h--;
            }

            else{
                m++;
            }
        }
    }
}