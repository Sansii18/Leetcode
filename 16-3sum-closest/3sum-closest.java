class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum2 = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum2 - target) < Math.abs(sum-target)) {
                    sum = sum2;
                }

                if (sum2 < target) {
                    left++;
                } else if (sum2 > target) {
                    right--;  
                } else {
                    return sum2; 
                }
            }
        }

        return sum;
    }
}