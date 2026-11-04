class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        // int count = 0;
        int i = 0, j = 0;
        while(i < s.length()  && j < t.length()){
            if(s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == s.length();

        // for(int j = 0 ; j < t.length() ; j++){
        //     if(s.charAt(i) == t.charAt(j)){
        //         count++;
        //         if(count == s.length()){
        //             return true;
        //         }
        //         if(i+1 < s.length())
        //             i++;
        //         else break;
        //     }
        // }
        // return false;
    }
}