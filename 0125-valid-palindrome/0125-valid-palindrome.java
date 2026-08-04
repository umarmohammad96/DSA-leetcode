class Solution {
    public boolean isPalindrome(String s) {
        String regex = "[^a-zA-Z0-9]";
        String result = s.replaceAll(regex, "").toLowerCase();
        int len = result.length();
        // for (int i = 0; i < len / 2; i++) {
        //     if (result.charAt(i) != result.charAt(len - 1 - i)) {
        //         return false;
        //     }
        // }
        // return true;
        int left=0;
        int right = result.length() -1; 
        while(left < right){
            if(result.charAt(left) != result.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}