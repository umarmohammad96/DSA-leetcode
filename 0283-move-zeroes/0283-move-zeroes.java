class Solution {
    public void moveZeroes(int[] nums) {
        int []arr = new int[nums.length];
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(!(nums[i]==0))  arr[index++] = nums[i] ;
        }
        for(int x = 0 ; x < arr.length ; x++){
            nums[x]=arr[x];
        }
    }
}