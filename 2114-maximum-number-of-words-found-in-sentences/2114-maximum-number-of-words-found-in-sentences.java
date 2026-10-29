class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(int i = 0 ; i < sentences.length ; i++){
            int count = sentences[i].length() - sentences[i].replace(" ", "").length();
            maxCount = Math.max(maxCount, count);
        }
        return maxCount+1;
    }
}