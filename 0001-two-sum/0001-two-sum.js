/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    // let l = 0 ;
    // for(l = 0 ; l < nums.length-1 ; l++ ){
    // for(let r = l+1 ; r < nums.length ; r++){
    //   let sum = nums[l]+nums[r];
    //   if(sum == target) return [l,r];
    // }
    // }

    let hm = new Map();
    for(let i=0;i<nums.length;i++){
        hm.set(nums[i],i);
    }
    for(let i = 0 ; i < nums.length;i++){
        let tar = target - nums[i];
        if(hm.has(tar) && hm.get(tar) != i) return [i,hm.get(target-nums[i])]
    }
};