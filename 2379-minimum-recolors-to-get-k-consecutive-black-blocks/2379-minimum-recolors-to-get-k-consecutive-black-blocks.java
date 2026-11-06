class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whites = 0;
        
        
        //calculate no of whites in each window;
        for(int i = 0 ; i < k ; i++){
            if(blocks.charAt(i) == 'W'){
                whites++;
            }
        }

        int minCount = whites;
        int left = 0;
        
        for(int right = k; right < blocks.length() ; right++){
            if(blocks.charAt(right) == 'W'){
                whites++;
            }
            if(blocks.charAt(left) == 'W'){
                whites--;
            }
            if(minCount > whites){
                minCount = whites;
            }
            left++;
        
            }
        return minCount;
    }
}