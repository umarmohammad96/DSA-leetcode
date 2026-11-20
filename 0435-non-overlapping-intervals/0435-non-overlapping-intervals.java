class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length <= 1) return 0;
        int count = 0;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int next_start = intervals[intervals.length - 1][0];
        for(int i = intervals.length - 2 ; i >= 0 ; i --){
            if(intervals[i][1] > next_start){
                count++;
            }
            else {
                next_start = intervals[i][0];
            }
        }
        return count;
    }
}