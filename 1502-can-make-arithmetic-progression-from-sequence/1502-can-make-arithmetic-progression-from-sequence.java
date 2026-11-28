class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length == 1) return true;
        Arrays.sort(arr);
        int a = arr[1] - arr[0];
        for(int i = 2 ; i < arr.length; i++){
            if(arr[i] - arr[i-1] != a) return false;
        }
        return true;
    }
}