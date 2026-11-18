class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int arr[] = new int[temperatures.length];
        Stack<Integer> stk = new Stack<>();
        // Arrays.fill(arr,0);
        for(int i = 0 ; i < temperatures.length ; i++){ 
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]){
                arr[stk.peek()] = i - stk.peek();
                stk.pop();
            }
            stk.push(i);
        }

        return arr;
    }
}