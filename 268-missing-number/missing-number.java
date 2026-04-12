class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        int expected = n * (n + 1) / 2;

        return expected - sum;
    }
}