class Solution {
    public int mySqrt(int x) {
        int val = 0;
        long i = 1;
        while(i*i <=x){
            val = (int)i;
            i++;
        }
        return val;
    }
}