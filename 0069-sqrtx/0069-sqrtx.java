class Solution {
    public int mySqrt(int x) {
        // int val = 0;
        // long i = 1;
        // while(i*i <=x ){
        //     val = (int)i;
        //     i++;
        // }
        // return val;
        if (x == 0 ) return 0;
        else if (x == 1 || x == 2 ) return 1;
        long l = 1;
        long h = x;
        int val = 0;
        while(l<=h){
            long m = (l+h)/2;
            if(m*m == x) return (int) m;
            else if(m*m < x){ 
                l = m+1;
                val = (int) m;
            }
            else h = m -1;
        }
        return val;
    }
}