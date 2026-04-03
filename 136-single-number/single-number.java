class Solution {
    public int singleNumber(int[] nums) {
        // a^a = 0;
        // a^0 = a;
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}