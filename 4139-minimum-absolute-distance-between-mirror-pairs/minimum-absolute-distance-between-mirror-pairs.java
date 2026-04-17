class Solution {
    public int minMirrorPairDistance(int[] nums) {
        // KEY -> nums[i] , VALUE -> i

        HashMap <Integer,Integer> map = new HashMap<>();
        int dist = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                dist = Math.min(dist , i - map.get(nums[i]));
            }
            map.put(reverse(nums[i]),i);
        }
        return dist == Integer.MAX_VALUE ? -1 : dist;
    }

    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;     
            rev = rev * 10 + digit;   
            num = num / 10;       
        }
        return rev;
    }
}