class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums2.length ; i++){
            while(!stk.isEmpty() && stk.peek() < nums2[i]){
                map.put(stk.pop(), nums2[i]);
            }
            stk.push(nums2[i]);
        }
        while(!stk.isEmpty()){
            map.put(stk.pop(), -1);
        }
        int arr[] = new int[nums1.length];
        for(int i = 0 ; i < nums1.length ; i++){
            if(map.containsKey(nums1[i])) arr[i] = map.get(nums1[i]);
            else arr[i] = -1;
        }
        return arr;
    }
}