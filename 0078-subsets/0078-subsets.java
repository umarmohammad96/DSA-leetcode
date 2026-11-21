class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        List<Integer> al = new ArrayList<>();
        findSub(n,index, al, result, nums);
        return result;
    }
    public void findSub(int n, int index,List<Integer> al,List<List<Integer>> result, int[] nums){
        if(index >= n){
            result.add(new ArrayList<>(al));
            return;
        }

        al.add(nums[index]);
        findSub(n, index+1, al, result, nums);
        al.remove(al.size()-1);
        findSub(n, index+1, al, result, nums);
    }
}