class Solution {
    public int maxArea(int[] height) {
        int i = 0 ;
        int j = height.length-1;
        int maxCap = 0;
        while(i < j){
            int curCap = Math.min(height[i], height[j])*(j-i);
            maxCap = Math.max(maxCap , curCap);
            if(height[i] > height[j]) j--;
            else i++;
        }
        return maxCap;
    }
}