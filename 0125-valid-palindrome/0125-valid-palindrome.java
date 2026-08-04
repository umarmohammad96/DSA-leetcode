class Solution {
    public boolean isPalindrome(String s) {
        String regex = "[^a-zA-Z0-9]";
        // String result = s.replaceAll(regex, "").toLowerCase();
        // int len = result.length();
        // for (int i = 0; i < len / 2; i++) {
        //     if (result.charAt(i) != result.charAt(len - 1 - i)) {
        //         return false;
        //     }
        // }
        // return true;
        // int left=0;
        // int right = result.length() -1; 
        // while(left < right){
        //     if(result.charAt(left) != result.charAt(right)) return false;
        //     left++;
        //     right--;
        // }
        // return true;

        int left=0;
        int right = s.length() -1; 
        while(left < right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))  left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))  right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }
}