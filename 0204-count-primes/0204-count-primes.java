class Solution {
    public int countPrimes(int n) {
        
        if(n <= 2) return 0;
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for(int p = 2 ; p*p < n ; p++){
            if(!notPrime[p]){
                for(int i = p*p ; i < n ; i+=p) notPrime[i] = true;
            }
        }
        for(int i = 2 ; i < n ; i++){
            if(!notPrime[i]) count++;
        }
        return count;
        // for(int i = 3; i < n ; i+=2){
        //     if(isPrime(i)) count++;
        // }
        // return count;
    }
    // public boolean isPrime(int m){
    //     for(int i = 2 ; i*i <= m ; i++){
    //         if(m%i == 0) return false;
    //     }
    //     return true;
    // }
}