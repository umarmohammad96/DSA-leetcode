// class Solution {
//     public boolean canCross(int[] stones) { 
//         int k = stones[1];
//         int[] dp = new int[stones.length];
//         dp[0] = 0;
//         int count = 0;
//         if(k != 1) return false;
//         int step2 = stones[2] - stones[1];
//         if(step2 != k-1 && step2 != k && step2 != k+1) return false;
//         for(int i = 2 ; i < stones.length ; i++){
//             int cur = 0;
//             boolean val = true;
//             int nextStep = 999999;
//             while(val && (i+cur) < stones.length){
//                 nextStep = Math.abs(stones[i] - stones[i+(cur++)]);
//                 if(nextStep != k-1 && nextStep != k && nextStep != k+1){
//                     val = false;
//                 }
//             }
//             k = Math.max(k, nextStep);
//             count++;
//         }
//         if(count == stones.length) return true;
//         return false;
//     }
// }


class Solution {
    // Memoization table: dp[currentStone][lastJumpSize] = can reach end from here
    private Boolean[][] dp;
  
    // Maps stone position to its index in the stones array
    private Map<Integer, Integer> stoneToIndex;
  
    // Array of stone positions
    private int[] stones;
  
    // Total number of stones
    private int totalStones;

    /**
     * Determines if a frog can cross the river by jumping on stones.
     * The frog starts at the first stone and must reach the last stone.
     * From stone i with last jump of k units, the next jump can be k-1, k, or k+1 units.
     * 
     * @param stones Array of stone positions in ascending order
     * @return true if the frog can reach the last stone, false otherwise
     */
    public boolean canCross(int[] stones) {
        // Initialize variables
        totalStones = stones.length;
        dp = new Boolean[totalStones][totalStones];
        this.stones = stones;
        stoneToIndex = new HashMap<>();
      
        // Build position to index mapping for O(1) lookup
        for (int i = 0; i < totalStones; i++) {
            stoneToIndex.put(stones[i], i);
        }
      
        // Start DFS from first stone with initial jump size of 0
        return dfs(0, 0);
    }

    /**
     * Recursive DFS with memoization to check if we can reach the last stone.
     * 
     * @param currentIndex Index of the current stone
     * @param lastJumpSize Size of the jump that brought us to current stone
     * @return true if we can reach the last stone from current position
     */
    private boolean dfs(int currentIndex, int lastJumpSize) {
        // Base case: reached the last stone
        if (currentIndex == totalStones - 1) {
            return true;
        }
      
        // Check memoization table
        if (dp[currentIndex][lastJumpSize] != null) {
            return dp[currentIndex][lastJumpSize];
        }
      
        // Try all possible jump sizes: k-1, k, k+1
        for (int nextJumpSize = lastJumpSize - 1; nextJumpSize <= lastJumpSize + 1; nextJumpSize++) {
            // Jump size must be positive
            if (nextJumpSize > 0) {
                // Calculate the landing position
                int targetPosition = stones[currentIndex] + nextJumpSize;
              
                // Check if there's a stone at the target position
                if (stoneToIndex.containsKey(targetPosition)) {
                    int targetIndex = stoneToIndex.get(targetPosition);
                  
                    // Recursively check if we can reach the end from the target stone
                    if (dfs(targetIndex, nextJumpSize)) {
                        // Cache and return successful result
                        return dp[currentIndex][lastJumpSize] = true;
                    }
                }
            }
        }
      
        // No valid path found, cache and return false
        return dp[currentIndex][lastJumpSize] = false;
    }
}
