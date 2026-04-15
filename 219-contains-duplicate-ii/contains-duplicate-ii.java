class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // key -> nums[i], value -> index

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && 
                Math.abs(i - map.get(nums[i])) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }
}