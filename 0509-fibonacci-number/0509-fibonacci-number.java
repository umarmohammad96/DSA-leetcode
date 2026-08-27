class Solution {
    public int fib(int n) {
        try{
        int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
        arr[0]=0;
        arr[1]=1;
        for(int i = 2 ; i < n+1 ; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
        }
        catch (Exception e){
            return 0;
        }
    }
}