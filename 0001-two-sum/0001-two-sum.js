/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let l = 0 ;
    for(l = 0 ; l < nums.length-1 ; l++ ){
    for(let r = l+1 ; r < nums.length ; r++){
      let sum = nums[l]+nums[r];
      if(sum == target) return [l,r];
    }
    }
};