class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1) return nums[0];
        int l=0 , r = k-1;
        double ans = 0;
        double current = 0;
        for(int i=0 ; i<k ; i++) current += nums[i];
        ans = current;
        while(r < nums.length-1){
            current = current - nums[l++];
            current = current + nums[++r];
            ans = Math.max(ans, current);
        }
        return ans/k;
    }
}