class Solution {
    public int maxArea(int[] height) {
        int i = 0 ;
        int j = height.length-1;
        int maxCap = 0;
        while(i < j){
            int h_i = height[i];
            int h_j = height[j];
            
            int curCap = (h_i < h_j ? h_i : h_j) * (j - i);
            if (curCap > maxCap) {
                maxCap = curCap;
            }
            
            if (h_i > h_j) {
                j--;
            } else {
                i++;
            }
        }
        return maxCap;
    }
}