class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i < s.length() ;i++){
            char curr = s.charAt(i);
            if(!stk.isEmpty() && (curr - stk.peek() == 1 || curr - stk.peek() == 2)){
                stk.pop();
                continue;
            }
            stk.push(curr);
        }
        if(stk.isEmpty()) return true;
        return false;
    }
}