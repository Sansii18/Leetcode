class Solution {
    public int findLHS(int[] nums) {
        int l=0;
        int r=1;
        int ans=0;
        Arrays.sort(nums);
        while(r < nums.length){
            while(nums[r] - nums[l] > 1){
                l++;
            }
            if(nums[r] - nums[l] == 1) ans = Math.max(ans, r-l+1);
            r++;
        }
        return ans;
    }
}