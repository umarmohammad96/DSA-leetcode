class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> hs = new TreeSet<>();
        for(int x : nums){
            if(x>0) hs.add(x);
        }
        int n = 1;
        for(int y : hs){
            if(y != n) return n;
            n++;
        }
        return n;
    }
}